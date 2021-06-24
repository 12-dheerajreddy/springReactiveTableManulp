package com.example.repo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties.Reactive;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bean.Customers;
import com.example.bean.Orders;

import reactor.core.publisher.Mono;

@Repository
public class CustRepo {
	
	Orders o;
	
	private static final String GET_USERS_QUERY="select * from Customers where CustomerID=?";
	private static final String GET_USERS_QUERY_ORDERS="SELECT * from Orders where CustomerID=?";
	private static final String GET_ALL="SELECT Orders.*, Customers.*\r\n"
			+ "FROM Orders\r\n"
			+ "INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID";
	
	
	@Autowired
	private JdbcTemplate jtemplate;
	
	
	public Mono<Customers> retrive(Integer CustomerID, Customers custom){
		Customers queryForObject = jtemplate.queryForObject(GET_USERS_QUERY, (rs,rowNum)->{
			return new Customers(rs.getInt("CustomerID"),rs.getString("CustomerName"),rs.getString("ContactName"),rs.getString("Country"),rs.getInt("locationCode"),rs.getString("state"));
		},CustomerID);
		if("india".equals(queryForObject.getCountry())) {
			queryForObject.setCountry("Bharath");
			queryForObject.setSsn(0);
		}
		if("US".equals(queryForObject.getCountry())) {
			queryForObject.setSsn(540);
		}
		
		
		Mono<Customers> just = Mono.just(queryForObject);
		
		return just;
		
	}


	public Mono<Orders> retriveData(Integer customerID, Orders ord) {
		Orders queryForObject = jtemplate.queryForObject(GET_USERS_QUERY_ORDERS, (rs,rowNum)->{
			return new Orders(rs.getInt("orderId"),rs.getInt("CustomerID"),rs.getString("orderdProdName"),rs.getString("OrderdStatus"));
		},customerID);
		
		queryForObject.setOrderDate(new Date());
		
		Mono<Orders> just = Mono.just(queryForObject);
		
		return just;	
		}
	
	/*public Mono<Customers> retriveAl(Integer customerID){
		Customers queryForObject = jtemplate.queryForObject(GET_ALL, (rs,rowNum)->{
			return new Customers(rs.getInt("CustomerID"),rs.getString("CustomerName"),rs.getString("ContactName"),rs.getString("Country"), new Orders(rs.getInt("orderId"), rs.getInt("customerID"), rs.getString("orderDate")));
		},customerID,customerID);
		Mono<Customers> just = Mono.just(queryForObject);
		return just;
	}*/
	
	
	

}
