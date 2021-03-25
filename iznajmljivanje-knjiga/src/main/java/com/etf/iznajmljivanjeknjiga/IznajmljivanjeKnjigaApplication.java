package com.etf.iznajmljivanjeknjiga;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
		MongoCollection<Document> connectionIznajmljivanje = database.getCollection("iznajmljivanje-knjiga");
		MongoCollection<Document> connectionKopijaKnjiga = database.getCollection("kopija-knjige");
		MongoCollection<Document> connectionReview = database.getCollection("review");

		ObjectMapper oMapper = new ObjectMapper();

		List<KopijaKnjige> insertKopijaKnjige = new ArrayList<>();
		insertKopijaKnjige.add(new KopijaKnjige(new Long(1),new Long(1), "Svjetlost",LocalDateTime.now()));
		insertKopijaKnjige.add(new KopijaKnjige(new Long(2),new Long(2), "Svjetlost",LocalDateTime.now()));
		insertKopijaKnjige.add(new KopijaKnjige(new Long(3),new Long(3), "Svjetlost",LocalDateTime.now()));
		insertKopijaKnjige.forEach(i->{
			connectionIznajmljivanje.insertOne( new Document( oMapper.convertValue(i, Map.class)));
	    });
		
		List<Iznajmljivanje> insertIznajmljivanje = new ArrayList<>();		
		insertIznajmljivanje.add(new Iznajmljivanje(new Long(1),new Long(1),new Long(1), LocalDateTime.now(),new Long(2),new Double(0)));
		insertIznajmljivanje.add(new Iznajmljivanje(new Long(2),new Long(2),new Long(1), LocalDateTime.now(),new Long(4),new Double(1.4)));
		insertIznajmljivanje.add(new Iznajmljivanje(new Long(3),new Long(4),new Long(2), LocalDateTime.now(),new Long(4),new Double(5)));
		insertIznajmljivanje.forEach(i->{
			connectionKopijaKnjiga.insertOne( new Document( oMapper.convertValue(i, Map.class)));
	    });
		
		
		List<Review> insertsReview=new ArrayList<>();
		insertsReview.add(new Review(new Long(1), new Long(1), new Double (3.5) ));
		insertsReview.add(new Review(new Long(2), new Long(2), new Double (4.5) ));
		insertsReview.add(new Review(new Long(3), new Long(2), new Double (1) ));
		insertsReview.forEach(i->{
	    	connectionReview.insertOne( new Document( oMapper.convertValue(i, Map.class)));
	    });
	    
		System.out.println("Iznajmljivanje:");
		MongoCursor<Document> iznamjlene=connectionIznajmljivanje.find().iterator() ;   
		while(iznamjlene.hasNext()) {
	    	ArrayList<Object> var=new ArrayList<>(iznamjlene.next().values());
	    	System.out.println(var.get(0)+" " +var.get(1)+" " +var.get(2)+" "+var.get(3));
		}
		
		System.out.println("Kopija knjiga:");
		MongoCursor<Document> kopija=connectionKopijaKnjiga.find().iterator() ;  
		while(kopija.hasNext()) {
	    	ArrayList<Object> var=new ArrayList<>(kopija.next().values());
	    	System.out.println(var.get(0)+" " +var.get(1)+" " +var.get(2)+" "+var.get(3));
		}
		
		System.out.println("Review:");
		MongoCursor<Document> review=connectionReview.find().iterator() ;   
		while(review.hasNext()) {
	    	ArrayList<Object> var=new ArrayList<>(review.next().values());
	    	System.out.println(var.get(0)+" " +var.get(1)+" " +var.get(2)+" "+var.get(3));
		}
	}

}
