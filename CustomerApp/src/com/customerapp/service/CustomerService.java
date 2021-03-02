package com.customerapp.service;

import com.customerapp.dao.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public Customer getCustomerById(int id);
}
