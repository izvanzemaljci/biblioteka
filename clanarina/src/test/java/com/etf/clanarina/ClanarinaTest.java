package com.etf.clanarina;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.etf.clanarina.model.Clanarina;
import com.etf.clanarina.repository.ClanarinaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClanarinaTest {
	@Autowired
	private ClanarinaRepository clanarinaRepository;

	@Test
	public void insertClanarinaTest() {
		Clanarina clanarina = new Clanarina(1234556L, 0L, "00/00/0000", 0.0);
		clanarinaRepository.insert(clanarina);
		Clanarina clanarinaCheck = clanarinaRepository.findById(1234556L).orElse(new Clanarina());
		Assert.isTrue(clanarinaCheck.equals(clanarina), "must be true");
	}

	@Test
	public void updateTest() {
		Clanarina clanarina = new Clanarina(123455556L, 0L, "00/00/0000", 0.0);
		clanarinaRepository.insert(clanarina);
		clanarina.setPlatiti(5.00);
		;
		clanarinaRepository.save(clanarina);
		Clanarina clanarina1 = clanarinaRepository.findById(123455556L).orElse(new Clanarina());
		Assert.isTrue(clanarina1.equals(clanarina), "must be true");
	}

	@Test
	public void findTest() {
		Clanarina clanarina = new Clanarina(12345555679L, 0L, "00/00/0000", 0.0);
		clanarinaRepository.insert(clanarina);
		Clanarina clanarina1 = clanarinaRepository.findById(12345555679L).orElse(new Clanarina());
		Assert.isTrue(clanarina1.equals(clanarina), "must be true");
	}

	@Test
	public void deleteTest() {
		Clanarina clanarina = new Clanarina(12345555678L, 0L, "00/00/0000", 0.0);
		clanarinaRepository.insert(clanarina);
		clanarinaRepository.deleteById(12345555678L);
		Clanarina clanarina1 = clanarinaRepository.findById(12345555678L).orElse(new Clanarina());
		Assert.isTrue(clanarina1.getIdKorisnika() == null && clanarina1.getDatumUpisa() == null
				&& clanarina1.getPlatiti() == null && clanarina1.getId() == null, "must be true");
	}

	@AfterEach
	public void destroy() {
		clanarinaRepository.deleteById(1234556L);
		clanarinaRepository.deleteById(123455556L);
		clanarinaRepository.deleteById(12345555679L);
	}

}
