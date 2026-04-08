
package com.epw.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epw.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}
