package com.techyolk.hms.service;

import java.util.List;

import com.techyolk.hms.model.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public List<Customer> listCustomers();

	public void getCustomerById(int id);

	public void deleteCustomer(int id);
}
