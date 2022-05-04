package com.example.springbootproject1.springproject;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
	
	@Autowired
	public DeviceService deviceService;
	
	@GetMapping("/getDevices")
	public List<Device> getDevices() {
		return  deviceService.getDevices();
	}

}
