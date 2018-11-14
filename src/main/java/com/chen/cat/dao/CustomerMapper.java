package com.chen.cat.dao;

import com.chen.cat.bean.Customer;
import com.chen.cat.bean.CustomerWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerWithBLOBs record);

    int insertSelective(CustomerWithBLOBs record);

    CustomerWithBLOBs selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CustomerWithBLOBs record);

    int updateByPrimaryKey(Customer record);

    List<Customer> queryCustomers();
}