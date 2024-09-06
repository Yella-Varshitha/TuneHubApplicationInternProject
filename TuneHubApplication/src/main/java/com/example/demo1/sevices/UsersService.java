package com.example.demo1.sevices;

import com.example.demo1.entities.Users;

public interface UsersService {
public String addUser(Users user);
public boolean emailExists(String email);
public boolean validateUser(String email,String password);
public String getRole(String email);

}
