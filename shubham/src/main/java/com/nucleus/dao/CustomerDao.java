package com.nucleus.dao;

import com.nucleus.model.Customer;

public interface CustomerDao 
{
	public void saveRecord(Customer customer);	
	public Customer getRecordByCustomerId(String customer_code);
	public void deleteRecordByCustomerCode(String customer_code);
	public Customer update2(Customer customer);
	public Customer update1(String customerid);

}
