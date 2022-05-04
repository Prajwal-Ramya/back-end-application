package com.example.springbootproject1.springproject.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class UserService {
	
	@Autowired UserRepository userRepository;
	
	public UserService() {
		
	}
	
	public List<UserMaster> getUsers(){
		return userRepository.findAll();
	}
	
	public UserMaster registerUser(UserMaster user){
		 
		return userRepository.save(user);
		
		 
	}
	
	public List<UserMaster> getByUserName(String UserName){
		return userRepository.findByUserName(UserName);
		}


	
}
