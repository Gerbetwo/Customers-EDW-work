
package com.epw.customer.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epw.customer.dto.CreateCustomerDto;
import com.epw.customer.dto.UpdateCustomerDto;
import com.epw.customer.entity.Customer;
import com.epw.customer.repository.CustomerRepository;
import com.epw.customer.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    // Inyección por constructor (la mejor práctica)
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + id));
    }

    @Override
    @Transactional
    public Customer save(CreateCustomerDto dto) {
        if (customerRepository.existsByEmail(dto.getEmail())) {
            throw new RuntimeException("Ya existe un cliente con ese email");
        }

        Customer customer = new Customer();
        customer.setFullName(dto.getFullName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());

        return customerRepository.save(customer);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if (!customerRepository.existsById(id)) {
            throw new RuntimeException("No se puede borrar: ID no existe");
        }
        customerRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Customer update(Long id, UpdateCustomerDto dto) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + id));

        if (customerRepository.existsByEmailAndIdNot(dto.getEmail(), id)) {
            throw new RuntimeException("Ya existe otro cliente con ese email");
        }

        customer.setFullName(dto.getFullName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());

        return customerRepository.save(customer);
    }
}
