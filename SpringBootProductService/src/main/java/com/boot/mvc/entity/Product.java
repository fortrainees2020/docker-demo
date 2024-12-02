package com.boot.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "product")
public class Product {
	  	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;	  	
	  	@Column(name="name")
	    private String name;	  	
	  	@Column(name="brand")
	    private String brand;	  	
	  	@Column(name="price")
	    private int price;	  	
		public Product() {
			super();	
		}
		public Product(Integer id, String name, String brand, int price) {
			super();
			this.id = id;
			this.name = name;
			this.brand = brand;
			this.price = price;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}	    
	    
	    
}
