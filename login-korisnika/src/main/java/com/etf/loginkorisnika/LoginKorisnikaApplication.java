package com.etf.loginkorisnika;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class LoginKorisnikaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LoginKorisnikaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
