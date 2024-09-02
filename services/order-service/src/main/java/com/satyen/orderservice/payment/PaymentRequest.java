package com.satyen.orderservice.payment;

import com.satyen.orderservice.customer.CustomerResponse;
import com.satyen.orderservice.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
