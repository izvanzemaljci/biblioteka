package com.etf.editzaposlenika;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EditZaposlenikaApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(EditZaposlenikaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
