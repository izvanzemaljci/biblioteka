package com.etf.iznajmljivanjeknjiga;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class IznajmljivanjeKnjigaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IznajmljivanjeKnjigaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
