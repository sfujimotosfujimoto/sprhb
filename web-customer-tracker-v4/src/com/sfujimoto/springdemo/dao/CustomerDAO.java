package com.sfujimoto.springdemo.dao;

import com.sfujimoto.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by sfujimoto on 2017/03/17.
 */
public interface CustomerDAO {

    public List<Customer> getCustomers();
}
