package com.qa.java.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qa.java.spring.ioc.beans.Customer;
import com.qa.java.spring.ioc.configuration.BeanConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[] {BeanConfig.class});
    	Customer mario = context.getBean(Customer.class);
    	
    	
    	System.out.println(mario);
    	
    }
}
