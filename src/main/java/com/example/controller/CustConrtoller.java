package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.CustomerOrder;
import com.example.bean.Customers;
import com.example.bean.Orders;
import com.example.serv.CustomerServ;

import reactor.core.publisher.Mono;

@RestController
public class CustConrtoller {
	
	@Autowired
	private CustomerServ cust;
	
	Customers c=new Customers();
	
	Orders o=new Orders();
	
	@GetMapping(value="/retrive/{CustomerID}" ,produces= {"application/json"})
	public Mono<Customers> retriveData(@PathVariable Integer CustomerID) {
		Mono<Customers> retriveTables = cust.retriveTables(CustomerID,c);
		return retriveTables;
	}
	
	@GetMapping(value="/retriveorder/{CustomerID}",produces= {"application/json"})
	public Mono<Orders> retriveOrder(@PathVariable Integer CustomerID){
		Mono<Orders> retriveOrder = cust.retriveOrder(CustomerID,o);
		return retriveOrder;		
	}
	
	
	
	@GetMapping(value="/retriveAll/{CustomerID}",produces= {"application/json"})
	public Mono<CustomerOrder> retriveAllDelails(@PathVariable Integer CustomerID){
		Mono<CustomerOrder> retriveAll = cust.retriveAll(CustomerID,c,o);
				
		return retriveAll;
	}
	
	
	
	
	
	
	
	
	
	
	/*@GetMapping(value="/retriveAll/{CustomerID}",produces= {"application/json"})
	public Mono<Customers> retriveData(@PathVariable Integer CustomerID) {
		Mono<Customers> retriveTables = cust.retriveTables(CustomerID);
		return retriveTables;
	}*/

}
