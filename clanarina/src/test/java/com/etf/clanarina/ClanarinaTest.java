package com.etf.clanarina;

import java.nio.charset.Charset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.etf.clanarina.controller.clanarinaController;
import com.etf.clanarina.repository.ClanarinaRepository;
import com.etf.clanarina.repository.KorisnikRepository;

@RunWith(SpringRunner.class) 
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
        mockMvc.perform(MockMvcRequestBuilders.post("/korisnik/find/0")
          .content(korisnik)
          .contentType(MediaType.APPLICATION_JSON_UTF8))
          .andExpect(MockMvcResultMatchers.status().isOk())
          .andExpect(MockMvcResultMatchers.content()
            .contentType(textPlainUtf8));
    }

    
}
