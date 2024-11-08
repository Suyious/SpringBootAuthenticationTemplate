package com.xetra.xetra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xetra.xetra.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }