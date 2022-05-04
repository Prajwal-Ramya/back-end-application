package com.example.springbootproject1.springproject.order;

import java.sql.Date;
import java.util.List;

public class OrderDetails {

	private String userName;
	private Date dateOfPurchase;
	private List<OrderItemData> orderItems;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public List<OrderItemData> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemData> orderItems) {
		this.orderItems = orderItems;
	}
}
