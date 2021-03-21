package com.etf.iznajmljivanjeknjiga;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		MongoCollection<Document> collection = database.getCollection("login-korisnika");
		
		Document k3 = new Document("_id",new ObjectId());
		k3.append("id", "4").append("username", "irma").append("password", "123").append("role", "korisnik") ;
		collection.insertOne(k3);
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
