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
        System.out.println("Test1....");
        System.out.println("Test2....");
        System.out.println("Test3....");
        return customer;
    }

    public Customer getCustomer2() {
        System.out.println("Test1....");
        System.out.println("Test2....");
        System.out.println("Test3....");
        return customer;
    }
}
