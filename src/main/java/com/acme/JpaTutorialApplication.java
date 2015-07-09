package com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.acme.order.customer.Customer;
import com.acme.order.pizza.PizzaOrderService;
import com.acme.order.pizza.PizzaType;

@SpringBootApplication
public class JpaTutorialApplication {

    public static void main(String[] args) {       	
    
    	
        SpringApplication.run(JpaTutorialApplication.class, args);
    }
}
