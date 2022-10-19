package com.qa.java.spring.ioc.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

	private int id;
	private int customerId;
	private double orderValue;
	private String orderDate;
	
	
	public void init() {
		System.out.println("init");
	}
	public void destroy() {
		System.out.println("destroy");
	}
	

	
}
