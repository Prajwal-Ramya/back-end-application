package com.example.springbootproject1.springproject.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootproject1.springproject.DeviceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class OrderManagement {
	
	@Autowired
	public OrderService orderService;
	
	@Autowired
	public DeviceService deviceService;
	
	
	@PostMapping("/postOrder")
	public Object  register_User(@RequestBody OrderDetails orderDetails)
 
		{ObjectMapper mapper= new ObjectMapper();
		String jsonInString_success = "{\"OrderCreation\" : \"Success\"}";
		String jsonInString_failed = "{\"OrderCreation\" : \"Failed\"}";



		Object obj=null;

		
		try {
			
			for (int i =0;i<orderDetails.getOrderItems().size();i++)
			{	Order orderObj= new  Order();
			 	orderObj.setDevice(deviceService.getDeviceById(orderDetails.getOrderItems().get(i).getModel_id()).get());
			 	orderObj.setUserName(orderDetails.getUserName());
			 	orderObj.setQuantity(orderDetails.getOrderItems().get(i).getQuantity());
			 	orderObj.setDateOfPurchase(orderDetails.getDateOfPurchase());
			 	
			 	
			
				orderService.registerOrder(orderObj);
				obj = mapper.readValue(jsonInString_success, Object.class);
				
			}
		}
		catch(Exception e) {
			try {
				obj = mapper.readValue(jsonInString_failed, Object.class);
			} 
			catch (JsonProcessingException e1) {
				// TODO Auto-generated catch block			
				e1.printStackTrace();
			}
			 
		}
		
		return obj;
	}
	
	@GetMapping("/getOrderHistory")
	public List<Order> getOrder(@RequestParam (value="username") String username){
		List<Order>  userOrder = orderService.getByUserName(username);
		return userOrder;
		
	}

	
}