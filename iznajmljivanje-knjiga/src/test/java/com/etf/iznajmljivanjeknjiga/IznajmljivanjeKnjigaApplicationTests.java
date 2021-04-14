package com.etf.iznajmljivanjeknjiga;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.etf.iznajmljivanjeknjiga.model.IznajmljivanjeEntity;
import com.etf.iznajmljivanjeknjiga.repository.IznajmljivanjeKnjigaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class IznajmljivanjeKnjigaApplicationTests {

	@Autowired
	private IznajmljivanjeKnjigaRepository repository;

	@Test
	public void insertClanarinaTest() {
		IznajmljivanjeEntity iznajmljivanje = new IznajmljivanjeEntity(1L, 1L, 1L, LocalDate.now(), 2L, 0.0);
		repository.insert(iznajmljivanje);
		IznajmljivanjeEntity iznajmljivanjeCheck = repository.findById(1L).orElse(new IznajmljivanjeEntity());
		Assert.isTrue(iznajmljivanjeCheck.equals(iznajmljivanje), "must be true");
	}

	@Test
	public void updateTest() {
		IznajmljivanjeEntity iznajmljivanje = new IznajmljivanjeEntity(3L, 1L, 1L, LocalDate.now(), 2L, 5.0);
		repository.insert(iznajmljivanje);
		iznajmljivanje.setPlatiti(3.0);
		repository.save(iznajmljivanje);
		IznajmljivanjeEntity clanarina1 = repository.findById(3L).orElse(new IznajmljivanjeEntity());
		Assert.isTrue(clanarina1.equals(iznajmljivanje), "must be true");
	}

	@AfterEach
	public void destroy() {
		repository.deleteById(3L);
		repository.deleteById(1L);
	}

}
