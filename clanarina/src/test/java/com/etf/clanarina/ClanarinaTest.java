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
import com.etf.clanarina.repository.ClanarinaRepository;
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
    private ClanarinaRepository mongoTemplate;
	
	
	@Test
    public void execute() {
		Clanarina clanarina=new Clanarina(8998L, 0L, "00/00/0000", 0.0);
		mongoTemplate.insert(clanarina);
		Optional <Clanarina> clanarina1= mongoTemplate.findById(8989L);
		Assert.isTrue(clanarina1.equals(clanarina1), "must be true");

    }
	@AfterEach
    public void destroy() {
        mongoTemplate.delete(8998L);
    }

	
}

