package com.etf.clanarina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mongodb.client.MongoDatabase;

import com.etf.clanarina.repository.ClanarinaRepository;

@SpringBootApplication
public class ClanarinaApplication {
	@Autowired
	public static MongoDatabase database;
	@Autowired
	private ClanarinaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ClanarinaApplication.class, args);
		
		/*
		MongoClient mongoClient =  MongoClients.create("mongodb+srv://sanja:borkvOCiBpguBQtt@cluster0.7prvw.mongodb.net/biblioteka?retryWrites=true&w=majority");
		MongoDatabase database = mongoClient.getDatabase("biblioteka");
		MongoCollection<Document> connectionClanarina = database.getCollection("clanarina");
		MongoCollection<Document> connectionKorisnik = database.getCollection("korisnik");
		ObjectMapper oMapper = new ObjectMapper();
		
		List<Clanarina> insertClanarina = new ArrayList<>();
		insertClanarina.add(new Clanarina(new Long(1), new Long(1), LocalDateTime.now(), new Double(0)));
		insertClanarina.add(new Clanarina(new Long(2), new Long(2), LocalDateTime.now(), new Double(1.0)));
		insertClanarina.add(new Clanarina(new Long(3), new Long(3), LocalDateTime.now(), new Double(2)));
		insertClanarina.forEach(i->{
			connectionClanarina.insertOne(new Document(oMapper.convertValue(i, Map.class)));
		});
		
		List<Korisnik> insertKorisnik = new ArrayList<>();
		insertKorisnik.add(new Korisnik(new Long(0), new String("Almasa"), new String("Festa"), LocalDateTime.now(), new Long(0)));
		insertKorisnik.add(new Korisnik(new Long(1), new String("Sanja"), new String("Milovic"), LocalDateTime.now(), new Long(1)));
		insertKorisnik.add(new Korisnik(new Long(2), new String("Irma"), new String("Osmankovic"), LocalDateTime.now(), new Long(2)));
		insertKorisnik.add(new Korisnik(new Long(3), new String("Sara"), new String("Ramadanovic"), LocalDateTime.now(), new Long(3)));
		insertKorisnik.forEach(i->{
			connectionKorisnik.insertOne(new Document(oMapper.convertValue(i, Map.class)));
		});
		
		System.out.println("Clanarina");
		MongoCursor<Document> clanarina=connectionClanarina.find().iterator();
		while(clanarina.hasNext()) {
			ArrayList<Object> var =new ArrayList<> (clanarina.next().values());
			System.out.println(var.get(0)+" "+var.get(1)+" "+var.get(2)+" "+var.get(3));
		}
		
		System.out.println("Korisnik");
		MongoCursor<Document> korisnik=connectionKorisnik.find().iterator();
		while(korisnik.hasNext()) {
			ArrayList<Object> var =new ArrayList<> (korisnik.next().values());
			System.out.println(var.get(0)+" "+var.get(1)+" "+var.get(2)+" "+var.get(3)+" "+var.get(4));
		}*/
		
	


		
		
	}

	
}