package com.etf.clanarina;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.junit.Test;

import com.mongodb.BasicDBObjectBuilder;
/*import com.mongodb.DBObject;
import com.mongodb.assertions.Assertions;
import com.mongodb.client.MongoClients;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.IMongodConfig;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.process.runtime.Network;


@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
public class ClanarinaControllerTest {
	private static final String CONNECTION_STRING = "mongodb://%s:%d";

	private MongodExecutable mongodExecutable;
	private MongoTemplate mongoTemplate;
	
	@BeforeEach
	void BeforeEach() throws Exception {
		String ip = "localhost";
		int port = 8080;
		IMongodConfig mongodConfig = new MongodConfigBuilder().version(Version.Main.PRODUCTION).net(new Net(ip, port, Network.localhostIsIPv6())).build();
		MongodStarter starter = MongodStarter.getDefaultInstance();
	    mongodExecutable = starter.prepare(mongodConfig);
	    mongodExecutable.start();
	    mongoTemplate = new MongoTemplate(MongoClients.create(String.format(CONNECTION_STRING, ip, port)), "test");
	}
	@DisplayName("given object to save"
	        + " when save object using MongoDB template"
	        + " then object is saved")
	@Test
	void Test() throws Exception {
	        // given
		DBObject objectToSave = BasicDBObjectBuilder.start().add("key", "value").get();
	        // when
		mongoTemplate.save(objectToSave, "collection");

	        // then
		Assertions.    assertThat(mongoTemplate.findAll(DBObject.class, "collection")).extracting("key").containsOnly("value");
	    }
	@AfterEach
	void clean() {
	    mongodExecutable.stop();
	    
	
	
	
	
}


}/*
import com.etf.clanarina.dto.ClanarinaRequest;
import com.etf.clanarina.model.Clanarina;
import com.etf.clanarina.repository.ClanarinaRepository;
import com.etf.clanarina.service.ClanarinaService;


public class ClanarinaControllerTest {
	@Autowired
	private ClanarinaRepository repository;
	private ClanarinaService service;
	//private ClanarinaRequest request;
	@BeforeMethod
	public void beforeMethod() {
		
		this.repository=Mockito.mock(ClanarinaRepository.class);
		
		this.service= new ClanarinaService();
	}
	
	
	@Test
	public void testCreate() {
		ClanarinaRequest request= new ClanarinaRequest();
		request.setId(0L);
		request.setIdKorisnika(0L);
		request.setDatumUpisa("2020/04/01");
		request.setPlatiti(0.0);
		
		Clanarina clanarina=service.create(request);
		Assertions.assertThat(clanarina).usingRecursiveComparison().isEqualTo(request);
		
		
	}

}*/
