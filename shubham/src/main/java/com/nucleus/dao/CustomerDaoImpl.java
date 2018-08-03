package com.nucleus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
    JdbcTemplate jdbctemplate;
//------------------------------------------------------------------------//
	public void saveRecord(Customer customer) {
		System.out.println(customer);
		Object[] object={ customer.getCustomer_code(),customer.getCustomer_name(),customer.getCustomer_address1(),customer.getCustomer_address2(),customer.getCustomer_pinCode(),customer.getEmail_address(),customer.getContact_number(),customer.getPrimaryConatctPerson(),customer.getRecord_status(),customer.getActive_inactiveFlag(),customer.getModified_date(),customer.getModified_by(),customer.getAuthorized_date(),customer.getAuthorized_by()};
		//System.out.println(customer);
		jdbctemplate.update("insert into customer_entry values('123',?,?,?,?,?,?,?,?,?,?,'05-JUN-17','a',?,?,?,?)",object);
		
	}	
//------------------------------------------------------------------------//	
	public Customer getRecordByCustomerId(String customer_code) {
   
		return jdbctemplate.queryForObject("select * from customer_entry where customer_code=?", new Object[]{customer_code}, new RowMapper());
	}
//------------------------------------------------------------------------//	
	public void deleteRecordByCustomerCode(String customer_code) {
		
		jdbctemplate.update("delete from customer_entry where customer_code=?",customer_code);
	}
//------------------------------------------------------------------------//		
	public Customer update2(Customer customer) 
	{
		Object[] values={customer.getCustomer_name(),customer.getCustomer_address1(),customer.getCustomer_address2(),customer.getCustomer_pinCode(),customer.getEmail_address(),customer.getContact_number(),customer.getPrimaryConatctPerson(),customer.getRecord_status(),customer.getActive_inactiveFlag(),customer.getCustomer_code()};
		jdbctemplate.update("update customer_entry set Customer_name=?,Customer_address1=?,Customer_address2=?,Customer_pinCode=?,Email_address=?,Contact_number=?,Primary_Contact_Person=?,Record_status=?,Active_Inactive_Flag=? where Customer_code=?",values);
		  return customer;
	}

	public Customer update1(String customer_code) {
		
		return jdbctemplate.queryForObject("select * from customer_entry where customer_code=?", new Object[]{customer_code}, new RowMapper());
	}

}

class RowMapper implements org.springframework.jdbc.core.RowMapper<Customer>
{
	public Customer mapRow(ResultSet rs, int rownumber) throws SQLException
	{
		Customer customer=new Customer();
		customer.setCustomer_code(rs.getString(2));
		customer.setCustomer_name(rs.getString(3));
		customer.setCustomer_address1(rs.getString(4));
		customer.setCustomer_address2(rs.getString(5));
		customer.setCustomer_pinCode(rs.getInt(6));
		customer.setEmail_address(rs.getString(7));
		customer.setContact_number(rs.getString(8));
		customer.setPrimaryConatctPerson(rs.getString(9));
		customer.setRecord_status(rs.getString(10));
		customer.setActive_inactiveFlag(rs.getString(11));
		return customer;
	}	
}
