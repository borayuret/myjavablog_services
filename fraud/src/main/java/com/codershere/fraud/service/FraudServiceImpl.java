package com.codershere.fraud.service;


import com.codershere.clients.fraud.dto.FraudDetectionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FraudServiceImpl implements FraudService{

    @Override
    public FraudDetectionResult checkFraudCustomer(long custId) {
        return new FraudDetectionResult();
    }
}
