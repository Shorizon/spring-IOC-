package com.qa.java.spring.ioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qa.java.spring.ioc.beans.Order;

@Configuration
@ComponentScan(basePackages = "com.qa.java.spring.ioc.beans")

public class BeanConfig {

	
	@Bean(name = "order", initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	@Lazy
	public Order getOrderDetailsFirst() {
		return new Order().builder().customerId(1).id(1).orderDate("2022-30-12").orderValue(120.00).build();
		
	}
	@Bean(name = "order2", initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	@Lazy
	public Order getOrderDetailsSecond() {
		return new Order().builder().customerId(2).id(12).orderDate("2022-30-11").orderValue(2320.00).build();
		
	}

	
}
