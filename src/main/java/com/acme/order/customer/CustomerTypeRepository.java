package com.acme.order.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;



public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {
	

//List<Customer> findByCustomerTypeType(@Param("type") String type); 
}


