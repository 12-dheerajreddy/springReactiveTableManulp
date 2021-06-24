package com.example.bean;

import reactor.core.publisher.Mono;

public class CustomerOrder {
	
	/*private Integer CustomerID;
	private String CustomerName;
	private String ContactName;
	private String Country;
	private Orders orders;
	private Integer orderId;
	private String orderDate;*/
	Customers cust;
	Orders ord;
	
	
	
	
	


	public CustomerOrder(Customers cust, Orders ord) {
		super();
		this.cust = cust;
		this.ord = ord;
	}


	public CustomerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customers getCust() {
		return cust;
	}


	public void setCust(Customers cust) {
		this.cust = cust;
	}


	public Orders getOrd() {
		return ord;
	}


	public void setOrd(Orders ord) {
		this.ord = ord;
	}
	
	
	
	
	


/*	public CustomerOrder(Customers retriveTables, Orders retriveOrder) {
		super();
		this.retriveTables=retriveTables;
		this.retriveOrder=retriveOrder;
		
	}*/
	
/*	public CustomerOrder(Integer customerID, String customerName, String contactName, String country, Orders orders,
			Integer orderId, String orderDate) {
		super();
		CustomerID = customerID;
		CustomerName = customerName;
		ContactName = contactName;
		Country = country;
		this.orders = orders;
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	public Integer getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(Integer customerID) {
		CustomerID = customerID;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "CustomerOrder [CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", ContactName="
				+ ContactName + ", Country=" + Country + ", orders=" + orders + ", orderId=" + orderId + ", orderDate="
				+ orderDate + "]";
	}*/
	
	
	
	

}
