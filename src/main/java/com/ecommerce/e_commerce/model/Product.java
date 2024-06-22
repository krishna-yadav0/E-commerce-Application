package com.ecommerce.e_commerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	private Long id;
	private String name;
	private String description;
	private double price;
	
	
	

}


//get all product by Id
//get all poduct
//create product

//delete product by id
//update product by id


//clean compile install package
