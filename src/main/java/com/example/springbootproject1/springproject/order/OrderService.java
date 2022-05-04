package com.example.springbootproject1.springproject.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class OrderService {
	
	@Autowired OrderRepository orderRepository;
	
	public Order registerOrder(Order order){
		 
		return orderRepository.save(order);
		
		 
	}
	
    public List<Order> getByUserName(String UserName) {
    	
    	return orderRepository.findByUserName(UserName);
    }
}