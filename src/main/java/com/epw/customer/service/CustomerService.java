package com.epw.customer.service;

import java.util.List;

import com.epw.customer.dto.CreateCustomerDto;
import com.epw.customer.entity.Customer;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    Customer save(CreateCustomerDto dto);
    void deleteById(Long id);
}