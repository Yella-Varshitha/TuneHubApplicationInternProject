package com.example.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entities.Songs;
import com.example.demo1.entities.Users;

public interface SongsRepository extends JpaRepository<Songs, Integer>{
	public Songs findBySongname(String songname);
	

}
