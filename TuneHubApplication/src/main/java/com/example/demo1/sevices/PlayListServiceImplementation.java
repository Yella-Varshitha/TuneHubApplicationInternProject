package com.example.demo1.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.repositories.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService{
@Autowired
PlayListRepository prepo;

}
