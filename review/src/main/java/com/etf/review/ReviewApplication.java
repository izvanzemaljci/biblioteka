package com.etf.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		MongoClient mongoClient =  MongoClients.create(
				 "mongodb+srv://sanja:borkvOCiBpguBQtt@cluster0.7prvw.mongodb.net/biblioteka?retryWrites=true&w=majority");
		 MongoDatabase database = mongoClient.getDatabase("biblioteka");
		MongoCollection<Document> collection = database.getCollection("review");
		List<Review> inserts=new ArrayList<>();
		inserts.add(new Review(new Long(1), new Long(1), new Double (3.5) ));
		inserts.add(new Review(new Long(2), new Long(2), new Double (4.5) ));
		inserts.add(new Review(new Long(3), new Long(3), new Double (1) ));

		ObjectMapper oMapper = new ObjectMapper();
	    inserts.forEach(i->{
			collection.insertOne( new Document( oMapper.convertValue(i, Map.class)));
	    });
		
		MongoCursor<Document> doc=collection.find().iterator() ;   
		while(doc.hasNext()) {
	    	ArrayList<Object> var=new ArrayList<>(doc.next().values());
	    	System.out.println(var.get(0)+" " +var.get(1)+" " +var.get(2)+" "+var.get(3));
		}
		
	}

}
