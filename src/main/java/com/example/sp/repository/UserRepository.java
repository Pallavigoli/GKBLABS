package com.example.sp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findAllByEmail(String email);

	
}
