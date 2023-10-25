package com.codershere.fraud.controller;

import com.codershere.fraud.service.FraudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fraud")
@Slf4j
public class FraudController {

    @Autowired
    private FraudService fraudService;

    @GetMapping("{custId}")
    public boolean checkFraudCustomer(@PathVariable long custId)
    {
        return true;
    }

}
