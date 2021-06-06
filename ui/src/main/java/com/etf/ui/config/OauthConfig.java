//package com.etf.ui.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//@Configuration
//public class OauthConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.antMatcher("/**").authorizeRequests().antMatchers("/", "/login-korisnika/login**").permitAll().anyRequest()
//				.authenticated();
//
//	}
//
//	/*
//	 * @Bean public WebMvcConfigurer corsConfigurer() { return new
//	 * WebMvcConfigurer() {
//	 * 
//	 * @Override public void addCorsMappings(CorsRegistry registry) {
//	 * registry.addMapping("/**").allowedMethods("GET", "POST", "PUT",
//	 * "DELETE").allowedHeaders("*") .allowedOrigins("*"); } };
//	 */
//	// }
//}