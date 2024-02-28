package com.ramirez.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramirez.estudo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
