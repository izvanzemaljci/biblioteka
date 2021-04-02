/*package com.etf.clanarina;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value={"classpath:application.properties"})
public class SpringMongoConfig extends AbstractMongoConfiguration {

    @Value("${spring.data.mongodb.host}")
    private String host;

    @Value("${spring.data.mongodb.port}")
    private Integer port;

    @Value("${spring.data.mongodb.database}")
    private String database;

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(this.host + ":" + this.port), database);
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory()),
                new MongoMappingContext());
        converter.setMapKeyDotReplacement("\\+");

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory(), converter);

        return mongoTemplate;

    }

    @Override
    protected String getDatabaseName() {
        return this.database;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(this.host, this.port);
    }
}*/
