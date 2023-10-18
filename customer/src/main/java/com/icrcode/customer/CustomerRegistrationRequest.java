package com.icrcode.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email) {
}
