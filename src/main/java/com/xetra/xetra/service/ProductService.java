package com.xetra.xetra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xetra.xetra.model.Product;
import com.xetra.xetra.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    
    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
