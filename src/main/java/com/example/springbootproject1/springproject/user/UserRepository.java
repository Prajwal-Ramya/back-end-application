package com.example.springbootproject1.springproject.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserMaster, String>{
	
	List<UserMaster> findByUserName(String UserName);
	
	
}