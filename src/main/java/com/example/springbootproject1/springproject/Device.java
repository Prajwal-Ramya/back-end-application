package com.example.springbootproject1.springproject;



import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name = "device_list")

public class Device { 
	
	@Id
	private String model_id;
	private String name_of_the_device;
	private Integer year_of_the_release;
	private Integer price_of_the_device;
	private String image_of_the_device;
	private String memory;
	private String manufacturer;

	public String getModel_id() {
		return model_id;
	}
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	public String getName_of_the_device() {
		return name_of_the_device;
	}
	public void setName_of_the_device(String name_of_the_device) {
		this.name_of_the_device = name_of_the_device;
	}
	public Integer getYear_of_the_release() {
		return year_of_the_release;
	}
	public void setYear_of_the_release(Integer year_of_the_release) {
		this.year_of_the_release = year_of_the_release;
	}
	public Integer getPrice_of_the_device() {
		return price_of_the_device;
	}
	public void setPrice_of_the_device(Integer price_of_the_device) {
		this.price_of_the_device = price_of_the_device;
	}
	public String getImage_of_the_device() {
		return image_of_the_device;
	}
	public void setImage_of_the_device(String image_of_the_device) {
		this.image_of_the_device = image_of_the_device;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	
	
	
	
	

}
