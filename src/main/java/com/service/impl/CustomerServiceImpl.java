package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.CustomerMapper;
import com.pojo.Customer;
import com.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Resource
	private CustomerMapper customerMapper;

	public CustomerMapper getCustomerMapper() {
		return customerMapper;
	}

	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	@Override
	public List<Customer> showAllCustomer() {
		return null;
//		List<Menu> selByPid = CustomerMapper.selByPid(0);
//		return selByPid;
	}

	@Override
	public int insertCustomer(Customer customer) {
		return customerMapper.insertCustomer(customer);
	}

}
