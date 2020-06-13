package com.dzm.tomato.admin.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan("com.dzm.tomato.admin.**.dao")
public class MybatisConfig {
	
	@Autowired
	private DataSource dataSource;

	@Bean
	public ConfigurationCustomizer configurationCustomizer(){
		return new ConfigurationCustomizer() {
			@Override
			public void customize(org.apache.ibatis.session.Configuration configuration) {
				configuration.setMapUnderscoreToCamelCase(true);
			}
		};
	}

//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception{
//		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//		sessionFactory.setDataSource(dataSource);
//		sessionFactory.setTypeAliasesPackage("com.dzm.tomato.admin.**.model");
//
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		sessionFactory.setMapperLocations(resolver.getResources("classpath*:**/sqlmap/*.xml"));
//		return sessionFactory.getObject();
//	}
	
}
