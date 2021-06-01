//package com.etf.server.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//
//@EnableResourceServer
//@Configuration
//public class ResourceServerConfig extends WebSecurityConfigurerAdapter {
//
////	@Autowired
////	private AuthenticationManager authenticationManager2;
////
////	public void CustomAuthorizationServerConfigurer(AuthenticationConfiguration authenticationConfiguration)
////			throws Exception {
////		this.authenticationManager2 = authenticationConfiguration.getAuthenticationManager();
////	}
//
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////
////		http.requestMatchers().antMatchers("/login", "/oauth/authorize").and().authorizeRequests().anyRequest()
////				.authenticated().and().formLogin().permitAll();
////	}
//
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////
////		auth.parentAuthenticationManager(authenticationManager2).inMemoryAuthentication().withUser("Peter")
////				.password("peter").roles("USER");
////	}
//}