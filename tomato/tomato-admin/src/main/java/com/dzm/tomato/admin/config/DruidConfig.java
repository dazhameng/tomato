package com.dzm.tomato.admin.config;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfig {
	
//	@Bean(name="druidDataSource")
////	@ConditionalOnMissingBean
//	@ConfigurationProperties(prefix = "spring.datasource.druid")
//	public DataSource dataSource() {
//		return new DruidDataSource();
//	}

	@ConfigurationProperties(prefix = "spring.datasource.druid")
	@Bean
	public DataSource druid(){
		return  new DruidDataSource();
	}
	
	@Bean
//	@ConditionalOnMissingBean
	public ServletRegistrationBean<Servlet> druidServlet(){
		ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean<Servlet>(new StatViewServlet(), "/druid/*");
		//white list
		servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
		//balck list
		//servletRegistrationBean.addInitParameter("deny", "192.168.*.*");
		servletRegistrationBean.addInitParameter("loginUsername", "admin");
		servletRegistrationBean.addInitParameter("loginPassword", "admin");
		servletRegistrationBean.addInitParameter("resetEnable", "true");
		return servletRegistrationBean;
	}
	
	@Bean
//	@ConditionalOnMissingBean
	public FilterRegistrationBean<Filter> filterRegistrationBean(){
		FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new WebStatFilter());
        // 所有请求进行监控处理
		filterRegistrationBean.addUrlPatterns("/*");
        // 排除名单
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");
        return filterRegistrationBean;
	}
	
}
