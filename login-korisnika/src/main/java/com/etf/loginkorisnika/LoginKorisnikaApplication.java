package com.etf.loginkorisnika;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginKorisnikaApplication implements CommandLineRunner{

	@Autowired
	private KorisnikRepository korisnikRepository;

	public static void main(String[] args) {
		SpringApplication.run(LoginKorisnikaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Korisnik k1 = new Korisnik("1", "sanja", "123", "korisnik");
		Korisnik k2 = new Korisnik("2", "almasa", "123", "korisnik");
		Korisnik k3 = new Korisnik("3", "irma", "123", "korisnik");
		Korisnik k4 = new Korisnik("4", "sara", "123", "korisnik");

		korisnikRepository.save(k1);
		korisnikRepository.save(k2);
		korisnikRepository.save(k3);
		korisnikRepository.save(k4);

		List<Korisnik> korisnici = korisnikRepository.findAll();

		for(Korisnik k : korisnici) {
			System.out.println(k.toString());
		}
	}

}
