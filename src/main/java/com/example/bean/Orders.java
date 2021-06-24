package com.example.bean;

import java.util.Date;

public class Orders {
	
	private Integer orderId;
	private Integer customerID;
	private Date orderDate;
	private String orderdProdName;
	private String OrderdStatus;
	public Orders() {
	
	}
	
	public Orders(Integer orderId, Integer customerID, String orderdProdName, String orderdStatus) {
		super();
		this.orderId = orderId;
		this.customerID = customerID;
		//this.orderDate = orderDate;
		this.orderdProdName = orderdProdName;
		OrderdStatus = orderdStatus;
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date date) {
		this.orderDate = date;
	}
	public String getOrderdProdName() {
		return orderdProdName;
	}

	public void setOrderdProdName(String orderdProdName) {
		this.orderdProdName = orderdProdName;
	}

	public String getOrderdStatus() {
		return OrderdStatus;
	}

	public void setOrderdStatus(String orderdStatus) {
		OrderdStatus = orderdStatus;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerID=" + customerID + ", orderDate=" + orderDate
				+ ", orderdProdName=" + orderdProdName + ", OrderdStatus=" + OrderdStatus + "]";
	}

	
	
	
	

}
