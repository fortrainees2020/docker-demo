package com.boot;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boot.mvc.entity.Product;
import com.boot.mvc.service.ProductService;

@RestController
public class ProductController {
	Logger log=org.slf4j.LoggerFactory.getLogger(ProductController.class);
	
	 @Autowired
	    private ProductService service;
	 @RequestMapping("/test")
	 public String testProduct()
	 { 	return "Welcome to Product Catelog";
	 }
	
	 @RequestMapping("/products")
	 public List<Product> displayProduct()
	 { 	 log.info("Product list is going to dispaly 	");
		 List<Product> listProducts = service.listAll();
		 log.info(" Product list displayed");
		 log.debug("Missing product.png");
	
		 return listProducts;
	 }
	 
	 @DeleteMapping("/product/{id}")
	 public void delete(@PathVariable Integer id) {
	     service.delete(id);
	 }
	 @PutMapping("/product/{id}")
	 public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
	     try {
	    	  service.delete(id);
	         service.save(product);
	      	         return new ResponseEntity<>(HttpStatus.OK);
	     } catch (NoSuchElementException e) {
	         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	     }      
	 }
	 
	 @PostMapping("/products")
	 public void add(@RequestBody Product product) {
	     service.save(product);
	 }
	
	 
	
	 
	 @RequestMapping(value="/product/{id}", method = RequestMethod.GET)
	 public Object displayProduct(@PathVariable("id") int id)
	 {
		 try {
		        Product product = service.get(id);
		        return new ResponseEntity<Product>(product, HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		    }    
	 }
	}
