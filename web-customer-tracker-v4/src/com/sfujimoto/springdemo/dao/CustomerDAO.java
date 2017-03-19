package com.sfujimoto.springdemo.dao;

import com.sfujimoto.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by sfujimoto on 2017/03/17.
 */
public interface CustomerDAO {

    List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    List<Customer> searchCustomers(String theSearchName);
}
