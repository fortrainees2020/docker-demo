package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
//@EnableDiscoveryClient
public class SpringBootProductService {//extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductService.class, args);
	}
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(EurekaClientProductApplication.class); }
	 */

}
