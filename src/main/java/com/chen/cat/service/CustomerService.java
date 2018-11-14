package com.chen.cat.service;

import com.chen.cat.bean.Customer;
import com.chen.cat.bean.CustomerWithBLOBs;
import com.chen.cat.dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chen on 2018/11/13 16:38.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public List<Customer> queryCustomers()
    {
        return  customerMapper.queryCustomers();
    }
}
