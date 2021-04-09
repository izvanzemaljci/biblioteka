package com.etf.clanarina;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ClanarinaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClanarinaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
	}

}