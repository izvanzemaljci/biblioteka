package com.etf.loginkorisnika;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.etf.loginkorisnika.model.Korisnik;
import com.etf.loginkorisnika.repository.LoginKorisnikaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class LoginKorisnikaApplicationTests {

	@Autowired
	private LoginKorisnikaRepository repository;

	@Test
	public void insertClanarinaTest() {
		Korisnik korisnik = new Korisnik(1L, "Niko", "pw", 1L);
		repository.insert(korisnik);
		Korisnik korisnikCheck = repository.findById(1L).orElse(new Korisnik());
		Assert.isTrue(korisnikCheck.equals(korisnik), "must be true");
	}

	@Test
	public void updateTest() {
		Korisnik korisnik = new Korisnik(3L, "Marko", "pw", 1L);
		repository.insert(korisnik);
		korisnik.setPassword("novi PW");
		repository.save(korisnik);
		Korisnik korisnikCheck = repository.findById(3L).orElse(new Korisnik());
		Assert.isTrue(korisnikCheck.equals(korisnik), "must be true");
	}

	@AfterEach
	public void destroy() {
		repository.deleteById(1L);
	}
}
