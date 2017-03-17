package com.sfujimoto.springdemo.service;

import com.sfujimoto.springdemo.dao.CustomerDAO;
import com.sfujimoto.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sfujimoto on 2017/03/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    // need to inject customer DAO
    @Autowired
    private CustomerDAO customerDAO;


    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {

        customerDAO.saveCustomer(theCustomer);

    }
}
