package com.mongodb.mongodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.mongodb.*")
@EntityScan("com.mongodb.*")
@EnableMongoRepositories("com.mongodb.repository")
class SpringBootMongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDemoApplication.class, args);
	}

}
