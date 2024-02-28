package com.ramirez.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramirez.estudo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
