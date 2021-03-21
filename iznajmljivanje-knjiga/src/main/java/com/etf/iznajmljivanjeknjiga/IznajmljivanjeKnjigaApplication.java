package com.etf.iznajmljivanjeknjiga;

import java.util.ArrayList;

import org.bson.Document;
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
		    MongoCursor<Document> doc=collection.find().iterator() ;   
		    while(doc.hasNext()) {
		    	ArrayList<Object> var=new ArrayList<>(doc.next().values());
		    	System.out.println(var.get(0));
		    	System.out.println(var.get(1));
		    	System.out.println(var.get(2));
		    	System.out.println(var.get(3));
		    }
//		try(MongoClient mongoClient = new MongoClient(uri))
//			{
//				MongoDatabase database = mongoClient.getDatabase("test");			
//				MongoCollection<Document> collection = database.getCollection("test");
//				Document query = new Document("_id", new ObjectId("5e234fe121fcf183e83ddce2"));
//		        Document result = collection.find(query).iterator().next();
//
//		        System.out.println("Test3: "+result.getString("test3"));
//			}		
//		
//        SpringApplication.run(IznajmljivanjeKnjigaApplication.class, args);
	}

}
