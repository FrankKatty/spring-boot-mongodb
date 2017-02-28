package com.melco.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

@Configuration
public class DBConfig {
	
	@Autowired
	private Environment env;
	
	
	 public @Bean Mongo mongo() throws Exception {
	        return new Mongo(env.getProperty("mongodb.host"),Integer.parseInt(env.getProperty("mongodb.port")));
	    }

	    public @Bean MongoTemplate mongoTemplate() throws Exception {
	        return new MongoTemplate(mongo(), env.getProperty("mongodb.dbname"));
	    }

}
