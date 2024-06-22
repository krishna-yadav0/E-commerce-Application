package com.ecommerce.e_commerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.e_commerce.model.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();
	
	public Optional<Product> getProductById(Long id);
	
	public Product createProduct(Product product);

}
