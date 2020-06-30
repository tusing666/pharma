package com.amit.pharma.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.amit.pharma.repository.ProductMongoRepository;

//@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
@EnableMongoRepositories(basePackages = "com.amit.pharma.repository")
@Configuration
public class MongoConfig {

}
