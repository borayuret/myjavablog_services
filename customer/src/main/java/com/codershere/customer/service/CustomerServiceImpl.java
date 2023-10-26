package com.codershere.customer.service;

import com.codershere.clients.fraud.FraudClient;
import com.codershere.clients.fraud.dto.FraudDetectionResult;
import com.codershere.customer.dto.CustomerRequestDTO;
import com.codershere.customer.dto.CustomerResponseDTO;
import com.codershere.customer.entity.Customer;
import com.codershere.customer.mapper.CustomerMapper;
import com.codershere.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FraudClient fraudClient;

    @Override
    public void registerCustomer(CustomerRequestDTO customerDTO) {

//        Customer customer = Customer.builder().firstName(customerDTO.getFirstName())
//                .lastName(customerDTO.getLastName())
//                .email(customerDTO.getEmail())
//                .build();


        Customer customer =  customerMapper.customerRequestDTOToCustomer(customerDTO);
        customerRepository.save(customer);

        FraudDetectionResult fraudDetectionResult = fraudClient.checkFraudCustomer(customer.getId());

        log.info("Customer is saved with no {}", customer.getId());

    }

    @Override
    public List<CustomerResponseDTO> getCustomers() {
        List<Customer> customers = customerRepository.findAll();

        return customerMapper.customerListToCustomerResponseDTOList(customers);
    }
}
