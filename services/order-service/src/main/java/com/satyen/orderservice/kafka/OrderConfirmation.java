package com.satyen.orderservice.kafka;

import com.satyen.orderservice.customer.CustomerResponse;
import com.satyen.orderservice.order.PaymentMethod;
import com.satyen.orderservice.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
