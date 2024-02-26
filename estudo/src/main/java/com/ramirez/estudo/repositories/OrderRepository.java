package com.ramirez.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramirez.estudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
