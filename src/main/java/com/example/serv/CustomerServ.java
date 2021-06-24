package com.example.serv;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.bean.CustomerOrder;
import com.example.bean.Customers;
import com.example.bean.Orders;
import com.example.repo.CustRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServ {
	@Autowired
	CustomerServ cs;

	@Autowired
	private CustRepo custrepo;

	public Mono<Customers> retriveTables(Integer CustomerID, Customers custom) {
		
		return Mono.just(custom).flatMap(d->{
			return custrepo.retrive(CustomerID, custom);
		});

		
	}

	public Mono<Orders> retriveOrder(Integer CustomerID, Orders ord) {
		
		return Mono.just(ord).flatMap(d->{
			return custrepo.retriveData(CustomerID,ord);
		});
		
	}

	
	
	
	
	//Mono<CustomerOrder> mn = null;

	
	  public Mono<CustomerOrder> retriveAll(Integer CustomerID,Customers custom,Orders ord){
	  
	  Mono<Customers> retriveTables = cs.retriveTables(CustomerID, custom); 
	  Mono<Orders> retriveOrder = cs.retriveOrder(CustomerID, ord);
	 
	  
	/*  Mono<CustomerOrder> maps = retriveTables.zipWith(retriveOrder). map(tuple ->{
	  Customers cust=tuple.getT1(); Orders ord=tuple.getT2(); return new
	  CustomerOrder(cust,ord); });*/
	  
	  
	  Mono<CustomerOrder> maps =retriveTables.flatMap(info->retriveOrder.map(commits->new
			  CustomerOrder(info,commits)));
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  return maps; 
	  }
	 
	/*
	 * public Mono<Customers> retriveTables(Integer CustomerID){
	 * 
	 * Mono<Customers> retrive = custrepo.retriveAl(CustomerID);
	 * 
	 * return retrive;
	 * 
	 * }
	 */

}
