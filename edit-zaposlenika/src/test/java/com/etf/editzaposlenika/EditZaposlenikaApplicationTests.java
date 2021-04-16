package com.etf.editzaposlenika;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.etf.editzaposlenika.model.Zaposlenik;
import com.etf.editzaposlenika.repository.EditZaposlenikaRepository;
import com.etf.editzaposlenika.service.EditZaposlenikaService;

@RunWith(SpringRunner.class)
@SpringBootTest
class EditZaposlenikaApplicationTests {

	@Autowired
	private EditZaposlenikaRepository repository;

	@Autowired
	private EditZaposlenikaService service;

	@Test
	public void test() {
		service.getAll();
	}

	@Test
	public void insertZaposlenikTest() {
		Zaposlenik zaposlenik = new Zaposlenik(1L, 1L, "Ime", LocalDate.of(1999, 9, 9), LocalDate.of(2020, 2, 2));
		repository.insert(zaposlenik);
		Zaposlenik zaposlenikCheck = repository.findById(1L).orElse(new Zaposlenik());
		Assert.isTrue(zaposlenikCheck.equals(zaposlenik), "Must be true.");
	}

	@Test
	public void updateZaposlenikTest() {
		Zaposlenik zaposlenik = new Zaposlenik(2L, 2L, "Ime2", LocalDate.of(2000, 2, 2), LocalDate.of(2021, 1, 1));
		repository.insert(zaposlenik);
		zaposlenik.setName("NekoIme");
		repository.save(zaposlenik);
		Zaposlenik zaposlenikCheck = repository.findById(2L).orElse(new Zaposlenik());
		Assert.isTrue(zaposlenikCheck.equals(zaposlenik), "Must be true");
	}

	@AfterEach
	public void destroy() {
		repository.deleteById(1L);
		repository.deleteById(2L);
	}

}
