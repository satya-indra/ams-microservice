package com.satyen.orderservice.customer;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email
) {

}
