package com.ramirez.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramirez.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
