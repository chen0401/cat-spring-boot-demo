package com.chen.cat.controller;

import com.alibaba.fastjson.JSONObject;
import com.chen.cat.bean.Customer;
import com.chen.cat.bean.CustomerWithBLOBs;
import com.chen.cat.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chen on 2018/11/13 16:30.
 */
@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "")
    private JSONObject queryCustomers()
    {
        JSONObject jsonObject = new JSONObject();
        List<Customer> customers =  customerService.queryCustomers();
        jsonObject.put("datas",customers);
        return  jsonObject;
    }
}
