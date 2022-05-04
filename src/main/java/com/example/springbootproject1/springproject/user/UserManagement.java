package com.example.springbootproject1.springproject.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




@RestController


public class UserManagement {
	
	
	@Autowired
	public UserService userService;
	
	@PostMapping("/registerUser")
	public Object  register_User(@RequestBody UserMaster userData)
 
		{ObjectMapper mapper= new ObjectMapper();
		String jsonInString_success = "{\"UserCreation\" : \"Success\"}";
		String jsonInString_failed = "{\"UserCreation\" : \"Failed\"}";



		Object obj=null;

		try {
			userService.registerUser(userData);
			obj = mapper.readValue(jsonInString_success, Object.class);
		
			}
			catch(Exception e) {
				try {
					obj = mapper.readValue(jsonInString_failed, Object.class);
				} catch (JsonProcessingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		
		return obj;
	}
	
	

	@PostMapping("/verifyUser")
	public Object verify_User(@RequestBody UserMaster userData)
	{ObjectMapper mapper= new ObjectMapper();
	String jsonInString_true = "{\"Exists\" : \"True\"}";
	String jsonInString_false = "{\"Exists\" : \"False\"}";



	Object obj;




	try {
	List<UserMaster> resp=userService.getByUserName(userData.getUserName());

	if(resp.size()== 1)
	{
	obj = mapper.readValue(jsonInString_true, Object.class);
	}
	else
	{
	obj = mapper.readValue(jsonInString_false, Object.class);
	}
	return obj;
	}

	catch(Exception e) {

	return "Exception occured" + e.toString();
	}



	}
	
}
