package com.boot.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.mvc.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {}