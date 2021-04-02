package com.etf.editzaposlenika;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.etf.editzaposlenika.model.Zaposlenik;
import com.etf.editzaposlenika.repository.EditZaposlenikaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class EditZaposlenikaApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		
		SpringApplication.run(EditZaposlenikaApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {

	}
}
