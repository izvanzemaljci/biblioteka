package com.etf.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

//	@GetMapping("/user")
//	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
//		return Collections.singletonMap("name", principal.getAttribute("name"));
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// @formatter:off
//	        http
//	            .authorizeRequests(a -> a
//	                .antMatchers("/", "/error", "/webjars/**").permitAll()
//	                .anyRequest().authenticated()
//	            )
//	            .exceptionHandling(e -> e
//	                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//	            )
//	            .oauth2Login();
//	        // @formatter:on
//	}

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
