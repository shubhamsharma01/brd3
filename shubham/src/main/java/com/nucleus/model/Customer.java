package com.nucleus.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Customer 
{
	@Min(value=0)
	private int customer_id;
	@Length(min=2,max=100)
	private String customer_code;
	@Length(min=3,max=20)
	private String customer_name;
	@Length(min=3,max=20)
	private String customer_address1;
	@Length(min=3,max=20)
	private String customer_address2;
	@Max(value=6)
	private int customer_pinCode;
	@Email()
	private String email_address;
	@Max(value=10)
	private String contact_number;
	@Length(min=3,max=20)
	private String primaryConatctPerson;
	@NotEmpty
	private String record_status;
	@NotEmpty
	private String active_inactiveFlag;
	private String create_date;
	private String created_by;
	private String modified_date;
	private String modified_by;
	private String authorized_date;
	private String authorized_by;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address1() {
		return customer_address1;
	}
	public void setCustomer_address1(String customer_address1) {
		this.customer_address1 = customer_address1;
	}
	public String getCustomer_address2() {
		return customer_address2;
	}
	public void setCustomer_address2(String customer_address2) {
		this.customer_address2 = customer_address2;
	}
	public int getCustomer_pinCode() {
		return customer_pinCode;
	}
	public void setCustomer_pinCode(int customer_pinCode) {
		this.customer_pinCode = customer_pinCode;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getPrimaryConatctPerson() {
		return primaryConatctPerson;
	}
	public void setPrimaryConatctPerson(String primaryConatctPerson) {
		this.primaryConatctPerson = primaryConatctPerson;
	}
	public String getRecord_status() {
		return record_status;
	}
	public void setRecord_status(String record_status) {
		this.record_status = record_status;
	}
	public String getActive_inactiveFlag() {
		return active_inactiveFlag;
	}
	public void setActive_inactiveFlag(String active_inactiveFlag) {
		this.active_inactiveFlag = active_inactiveFlag;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_date() {
		return modified_date;
	}
	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getAuthorized_date() {
		return authorized_date;
	}
	public void setAuthorized_date(String authorized_date) {
		this.authorized_date = authorized_date;
	}
	public String getAuthorized_by() {
		return authorized_by;
	}
	public void setAuthorized_by(String authorized_by) {
		this.authorized_by = authorized_by;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_code="
				+ customer_code + ", customer_name=" + customer_name
				+ ", customer_address1=" + customer_address1
				+ ", customer_address2=" + customer_address2
				+ ", customer_pinCode=" + customer_pinCode + ", email_address="
				+ email_address + ", contact_number=" + contact_number
				+ ", primaryConatctPerson=" + primaryConatctPerson
				+ ", record_status=" + record_status + ", active_inactiveFlag="
				+ active_inactiveFlag + ", create_date=" + create_date
				+ ", created_by=" + created_by + ", modified_date="
				+ modified_date + ", modified_by=" + modified_by
				+ ", authorized_date=" + authorized_date + ", authorized_by="
				+ authorized_by + "]";
	}
	
}
