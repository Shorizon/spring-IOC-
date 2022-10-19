package com.qa.java.spring.ioc.beans;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 	
@Component
@Scope("prototype")
@Lazy

public class Customer {

	
	private int id;	private String name;	private String email;	private String contactNo;	
	@Autowired
	private List<Order> ordersList;


}
