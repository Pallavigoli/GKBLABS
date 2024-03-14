package com.example.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sp.entity.User;
import com.example.sp.repository.UserRepository;


//Creating Serivce class by using annotation @Serivce and implementing the interface userService
@Service
public class UserServiceImplementation implements UserService {

	//instance of UserRepository and initializating
	
	@Autowired
	UserRepository urepo;

	
	@Override
	public boolean checkUser(String email) {
		
		//checking in repo i.e database if user exists or not through email
		User user=urepo.findAllByEmail(email);
		
		if(user!=null)
		{
			return false;	
		}
		return true;
	}
	

	@Override
	public void addUser(User user) {
		
		//adding User details into repo i.e database 
		
		urepo.save(user);
	}


	@Override
	public List<User> retrieveDetials() {
		
		//retrieving all user details
		List<User> user=urepo.findAll();
		
		return user;
	}
}
