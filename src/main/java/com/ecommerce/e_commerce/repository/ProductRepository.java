package com.ecommerce.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.e_commerce.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
