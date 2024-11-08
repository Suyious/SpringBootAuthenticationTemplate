package com.xetra.xetra.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.xetra.xetra.model.Product;
import com.xetra.xetra.service.ProductService;

public class ProductControllerTest {
    
    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    public ProductControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        when(productService.getAllProducts()).thenReturn(Collections.singletonList(new Product()));
        List<Product> products = productController.getAllProducts();
        assertEquals(1, products.size());
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        when(productService.createProduct(product)).thenReturn(product);
        ResponseEntity<Product> response = productController.createProduct(product);
        assertEquals(HttpStatus.CREATED, response.getStatusCode()); // Check for 201 status
        assertEquals(product, response.getBody());
    }
}
