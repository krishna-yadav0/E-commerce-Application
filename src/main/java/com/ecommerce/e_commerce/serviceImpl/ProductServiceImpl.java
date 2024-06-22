package com.ecommerce.e_commerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.e_commerce.model.Product;
import com.ecommerce.e_commerce.repository.ProductRepository;
import com.ecommerce.e_commerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	 public List<Product> getAllProduct() {
	        return productRepository.findAll();
	    }
	 
	@Override
	 public Optional<Product> getProductById(Long id) {
	        return productRepository.findById(id);
	    }

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	

}
