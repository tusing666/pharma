package com.amit.pharma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.pharma.model.ProductEntity;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Integer>{

}
