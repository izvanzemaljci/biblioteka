package com.etf.iznajmljivanjeknjiga;

import java.util.ArrayList;
import java.util.Map;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class IznajmljivanjeKnjigaApplication {
	@Autowired
   public static MongoDatabase database;
	
	public static void main(String[] args) {
		
		MongoClient mongoClient =  MongoClients.create(
				 "mongodb+srv://sanja:borkvOCiBpguBQtt@cluster0.7prvw.mongodb.net/biblioteka?retryWrites=true&w=majority");
		 MongoDatabase database = mongoClient.getDatabase("biblioteka");
		MongoCollection<Document> collection = database.getCollection("iznajmljivanje-knjiga");
		Korisnik k2 = new Korisnik("2", "almasa", "123", "korisnik");
		
		ObjectMapper oMapper = new ObjectMapper();
	    Document user= new Document( oMapper.convertValue(k2, Map.class));
		collection.insertOne(user);
		
		MongoCursor<Document> doc=collection.find().iterator() ;   
		while(doc.hasNext()) {
	    	ArrayList<Object> var=new ArrayList<>(doc.next().values());
	    	System.out.println(var.get(0));
	    	System.out.println(var.get(1));
	    	System.out.println(var.get(2));
	    	System.out.println(var.get(3));
		}
		
	}

}
