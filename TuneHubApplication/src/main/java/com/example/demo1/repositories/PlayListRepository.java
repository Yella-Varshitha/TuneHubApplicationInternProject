package com.example.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entities.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList,Integer> {

}
