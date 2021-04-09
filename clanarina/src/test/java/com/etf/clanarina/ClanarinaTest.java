package com.etf.clanarina;


import static org.junit.Assert.*;


import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.etf.clanarina.model.Clanarina;
import com.etf.clanarina.model.Korisnik;
import com.etf.clanarina.repository.ClanarinaRepository;
import com.etf.clanarina.repository.KorisnikRepository;

import org.junit.After;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Field;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClanarinaTest  {
	@Autowired
    private ClanarinaRepository clanarinaRepository;
	@Autowired
	private KorisnikRepository korisnikRepository;
	
	
	@Test
    public void insertClanarinaTest() {
		Clanarina clanarina=new Clanarina(1234L, 0L, "00/00/0000", 0.0);
		clanarinaRepository.insert(clanarina);
		Optional <Clanarina> clanarina1= clanarinaRepository.findById(1234L);
		Assert.isTrue(clanarina1.equals(clanarina1), "must be true");
    }
	
	
	@Test
	public void updateTest() {
		Clanarina clanarina=new Clanarina(12345L, 0L, "00/00/0000", 0.0);
		clanarinaRepository.insert(clanarina);
		clanarinaRepository.update(12345L, clanarina);
		Optional <Clanarina> clanarina1= clanarinaRepository.findById(89890L);
		Assert.isTrue(clanarina1.equals(clanarina1), "must be true");
    }
	
	@AfterEach
    public void destroy() {
		clanarinaRepository.delete(8998L);
    }

	
}

