package com.codershere.fraud.service;

import com.codershere.clients.fraud.dto.FraudDetectionResult;

public interface FraudService {
    FraudDetectionResult checkFraudCustomer(long custId);
}
