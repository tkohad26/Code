package com.mediaocean.productbilling.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mediaocean.productbilling.entities.Products;

public interface ProductRepository extends CrudRepository<Products, Integer> {

	
}
