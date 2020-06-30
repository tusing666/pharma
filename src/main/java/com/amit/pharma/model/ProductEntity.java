package com.amit.pharma.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "product", catalog = "Test2")
public class ProductEntity {

	@Id
	private int id;
	private String name;
	private double mrp;
	private String manufacturer;
	
	public int getId() {
		return id;
	}
	public ProductEntity setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public ProductEntity setName(String name) {
		this.name = name;
		return this;
	}
	public double getMrp() {
		return mrp;
	}
	public ProductEntity setMrp(double mrp) {
		this.mrp = mrp;
		return this;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public ProductEntity setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}
	
	
}
