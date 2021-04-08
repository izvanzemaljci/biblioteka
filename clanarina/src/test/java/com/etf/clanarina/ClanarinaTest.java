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



/*@RunWith(SpringRunner.class) 
@WebMvcTest
@AutoConfigureMockMvc
public class ClanarinaTest {
	@MockBean
    private ClanarinaRepository clanarinaRepository;
    
	@MockBean
    private KorisnikRepository korisnikRepository;
	
    @Autowired
    clanarinaController ClanarinaController;

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void getRequestKorisnik() throws Exception {
        MediaType textPlainUtf8 = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
        String korisnik = "{\"ime\": \"Almasa\", \"prezime\" : \"Festa\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/korisnik/0")
          .content(korisnik)
          .contentType(MediaType.APPLICATION_JSON_UTF8))
          .andExpect(MockMvcResultMatchers.status().isOk())
          .andExpect(MockMvcResultMatchers.content()
            .contentType(textPlainUtf8));
    }

    
}*/
