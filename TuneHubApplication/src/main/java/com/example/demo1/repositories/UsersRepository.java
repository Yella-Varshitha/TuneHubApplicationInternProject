package com.example.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
public Users findByEmail(String email);

}
