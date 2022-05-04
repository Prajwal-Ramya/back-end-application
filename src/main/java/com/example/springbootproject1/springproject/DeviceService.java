package com.example.springbootproject1.springproject;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DeviceService {
	
	@Autowired DeviceRepository deviceRepository;
	
	public DeviceService() {
		
	}
	
	public List<Device> getDevices(){
		return deviceRepository.findAll();
	}
	
	public Optional<Device>  getDeviceById(String model_id){
		return deviceRepository.findById(model_id);
	}

}
