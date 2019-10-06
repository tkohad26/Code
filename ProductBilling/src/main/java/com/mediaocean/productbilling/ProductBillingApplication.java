package com.mediaocean.productbilling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mediaocean.productbilling.entities.Products;
import com.mediaocean.productbilling.repositories.ProductRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.mediaocean.productbilling"})
public class ProductBillingApplication {

	@Autowired	
	ProductRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductBillingApplication.class, args);
		ProductBillingApplication app=new ProductBillingApplication();
		//app.data();
	}
	
	
}
