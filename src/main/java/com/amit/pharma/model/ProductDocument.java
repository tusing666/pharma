package com.amit.pharma.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product")
public class ProductDocument {

	@Id
	private int id;
	private String name;
	private double mrp;
	private String manufacturer;
	
	public int getId() {
		return id;
	}
	public ProductDocument setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public ProductDocument setName(String name) {
		this.name = name;
		return this;
	}
	public double getMrp() {
		return mrp;
	}
	public ProductDocument setMrp(double mrp) {
		this.mrp = mrp;
		return this;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public ProductDocument setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}
	
	
}
