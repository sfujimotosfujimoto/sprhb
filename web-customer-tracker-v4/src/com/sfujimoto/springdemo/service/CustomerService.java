package com.sfujimoto.springdemo.service;

import com.sfujimoto.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by sfujimoto on 2017/03/17.
 */


public interface CustomerService {

    List<Customer> getCustomers();


    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);
}
