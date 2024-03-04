package com.ramirez.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramirez.estudo.entities.OrderItem;
import com.ramirez.estudo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	

}
