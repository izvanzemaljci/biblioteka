package com.etf.iznajmljivanjeknjiga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class IznajmljivanjeKnjigaApplication implements CommandLineRunner {
	@Autowired
	private DiscoveryClient discoveryClient;

	public static void main(String[] args) {
		SpringApplication.run(IznajmljivanjeKnjigaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
