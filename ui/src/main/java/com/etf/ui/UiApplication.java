package com.etf.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableZuulProxy
@SpringBootApplication
@ComponentScans({ @ComponentScan("com.etf.loginkorisnika.controller"), @ComponentScan("com.etf.ui.config") })
public class UiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*").allowedHeaders("*").allowedOrigins("*")
						.allowCredentials(true).maxAge(3600).exposedHeaders("*");
			}
		};
	}

}
