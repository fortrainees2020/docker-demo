package com.boot.mvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.mvc.entity.Product;
import com.boot.mvc.repo.ProductRepository;

@Service
@Transactional
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
     
    public List<Product> listAll() {
        List <Product>  productlist  = repo.findAll();  
        System.out.println(productlist);
        return productlist;
     }
    
    public void save(Product product) {
        repo.save(product);    }
     
    public Product get(int id) {
        return repo.findById(id).get();    }
     
    public void delete(int id) {
        repo.deleteById(id);    }
}