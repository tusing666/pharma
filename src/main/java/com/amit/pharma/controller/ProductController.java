package com.amit.pharma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amit.pharma.model.ProductEntity;
import com.amit.pharma.repository.ProductJpaRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductJpaRepository productJpaRepository;

	@RequestMapping(value = "/saveprod", method = RequestMethod.GET)
	@ResponseBody
	public ProductEntity saveProduct() {

		ProductEntity product = new ProductEntity();
		product.setId(1).setName("Test product").setMrp(123.21).setManufacturer("Test Company");
		
		productJpaRepository.save(product);
		
		return product;
	}
}
