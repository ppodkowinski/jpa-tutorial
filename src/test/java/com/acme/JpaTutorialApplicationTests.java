package com.acme;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acme.order.OrderFactory;
import com.acme.order.customer.Customer;
import com.acme.order.customer.CustomerRepository;
import com.acme.order.customer.CustomerType;
import com.acme.order.customer.CustomerTypeRepository;
import com.acme.order.pizza.OrderRepository;
import com.acme.order.pizza.PizzaOrder;
import com.acme.order.pizza.PizzaOrderService;
import com.acme.order.pizza.PizzaType;
import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTutorialApplication.class)
public class JpaTutorialApplicationTests {
@Autowired
private CustomerRepository customerRespository;
@Autowired
private OrderRepository orderRepository;
@Autowired
private PizzaOrderService pizzaOrderService;
@Autowired
private CustomerTypeRepository customerTypeRepository;
	@Test
	public void contextLoads() {
	}
	@Test
	public void dataLoads(){
		CustomerType customerType1 = new CustomerType(null, "aaa");
		CustomerType customerType2 = new CustomerType(null, "bbb");
		customerTypeRepository.save(Lists.newArrayList(customerType1));
		Customer customer1 = new Customer(null,"ddd","fff","fff",customerType1);
		Customer customer2 = new Customer(null,"eeee","ggg","hhhh",customerType2);    
		customerRespository.save(Lists.newArrayList(customer1,customer2));
		
		PizzaOrder pizzaOrder1 = new PizzaOrder(customer1,PizzaType.BIG);
		PizzaOrder pizzaOrder2 = new PizzaOrder(customer2,PizzaType.LARGE);
		orderRepository.save(Lists.newArrayList(pizzaOrder1,pizzaOrder2));
		
		pizzaOrderService.createOrder(customer1, PizzaType.BIG);
		
	
	}
}
