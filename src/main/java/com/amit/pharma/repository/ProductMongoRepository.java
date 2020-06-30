package com.amit.pharma.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amit.pharma.model.ProductDocument;

public interface ProductMongoRepository extends MongoRepository<ProductDocument, Integer> {

}
