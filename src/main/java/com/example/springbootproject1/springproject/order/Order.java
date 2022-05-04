package com.example.springbootproject1.springproject.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.springbootproject1.springproject.Device;






@Entity
@Table(name = "order", schema="public") 

	
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq_generator")
	@SequenceGenerator(name = "order_seq_generator", sequenceName = "order_id_seq", allocationSize = 1)
	
	@Column(name="id", nullable = false)
	private Long id;

	@Column(name="username", nullable = false)
	private String userName;
	

	@Column(name="quantity", nullable = false)
	private Integer quantity;
	

	@Column(name="dateofpurchase", nullable = false)
	private Date dateOfPurchase;
	
	 public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modelid", referencedColumnName = "model_id")
	private Device device;
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}


	
}