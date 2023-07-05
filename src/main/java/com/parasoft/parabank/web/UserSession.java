package com.parasoft.parabank.web;

import com.parasoft.parabank.domain.Customer;

/**
 * Object for storing logged in user session data
 */
public class UserSession {
    private final Customer customer;

    public UserSession(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        int a = 1;
        int b = 2;
        System.out.println(b);
        System.out.println("Test2....");
        System.out.println("Test3....");
        return customer;
    }
}
