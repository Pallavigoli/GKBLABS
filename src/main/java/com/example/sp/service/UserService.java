package com.example.sp.service;

import java.util.List;

import com.example.sp.entity.User;

public interface UserService {

	boolean checkUser(String email);

	void addUser(User user);

	List<User> retrieveDetials();

}