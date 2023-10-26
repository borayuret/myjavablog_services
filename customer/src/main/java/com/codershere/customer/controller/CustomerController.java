package com.codershere.customer.controller;

import com.codershere.customer.dto.CustomerRequestDTO;
import com.codershere.customer.dto.CustomerResponseDTO;
import com.codershere.customer.entity.Customer;
import com.codershere.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody CustomerRequestDTO customerDTO)
    {
        customerService.registerCustomer(customerDTO);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerResponseDTO> getCustomers()
    {
        return customerService.getCustomers();
    }


}
