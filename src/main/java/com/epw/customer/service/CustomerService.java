package com.epw.customer.service;

import com.epw.customer.dto.CreateCustomerDto;
import com.epw.customer.dto.UpdateCustomerDto;
import com.epw.customer.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(Long id);

    Customer save(CreateCustomerDto dto);

    Customer update(Long id, UpdateCustomerDto dto);

    void deleteById(Long id);
}