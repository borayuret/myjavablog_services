package com.codershere.customer.service;

import com.codershere.customer.dto.CustomerRequestDTO;
import com.codershere.customer.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    void registerCustomer(CustomerRequestDTO customerDTO);

    List<CustomerResponseDTO> getCustomers();
}
