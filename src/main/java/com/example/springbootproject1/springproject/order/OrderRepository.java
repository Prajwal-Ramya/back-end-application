package com.example.springbootproject1.springproject.order;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String>{
	
	
	List<Order> findByUserName(String UserName);
	
}