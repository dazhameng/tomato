package com.dzm.tomatoadmin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")	//允许跨域访问的路径
                .allowedOrigins("*")	//允许跨域访问的源
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")	//允许跨域访问的方法
                .maxAge(168000)	//预设时间间隔
                .allowedHeaders("*")	//允许跨域访问的头
                .allowCredentials(true);	//是否允许Cookie
    }
}
