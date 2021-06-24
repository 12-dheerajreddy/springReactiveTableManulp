package com.example.bean;

public class Customers {

	private Integer CustomerID;
	private String CustomerName;
	private String ContactName;
	private String Country;
	private Integer locationCode ;
	private String state;
	private Integer ssn;
	
	
	public Customers() {
		
	}
	

	public Customers(Integer customerID, String customerName, String contactName, String country, Integer locCode,
			String state) {
		super();
		CustomerID = customerID;
		CustomerName = customerName;
		ContactName = contactName;
		Country = country;
		this.locationCode  = locCode;
		this.state = state;
		this.ssn = ssn;
	}

	
	public Integer getLocCode() {
		return locationCode;
	}
	public void setLocCode(Integer locCode) {
		this.locationCode = locCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
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

	@Override
	public String toString() {
		return "Customers [CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", ContactName=" + ContactName
				+ ", Country=" + Country + ", locationCode=" + locationCode + ", state=" + state + ", ssn=" + ssn + "]";
	}	
	
}
