package com.codershere.customer.mapper;


import com.codershere.customer.dto.CustomerRequestDTO;
import com.codershere.customer.dto.CustomerResponseDTO;
import com.codershere.customer.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);

    CustomerResponseDTO customerToCustomerResponse(Customer customer);

    List<CustomerResponseDTO> customerListToCustomerResponseDTOList(List<Customer> customers);



}
