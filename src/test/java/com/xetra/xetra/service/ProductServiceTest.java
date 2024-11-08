package com.xetra.xetra.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.xetra.xetra.model.Product;
import com.xetra.xetra.repository.ProductRepository;

public class ProductServiceTest {
    
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;


    public ProductServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        when(productRepository.findAll()).thenReturn(Collections.singletonList(new Product()));
        List<Product> products = productService.getAllProducts();
        assertEquals(1, products.size());
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        when(productRepository.save(product)).thenReturn(product);
        Product createdProduct = productService.createProduct(product);
        assertEquals(product, createdProduct);
    }
}
