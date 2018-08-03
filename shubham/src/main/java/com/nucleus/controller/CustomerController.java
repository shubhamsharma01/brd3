package com.nucleus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.dao.CustomerDao;
import com.nucleus.model.Customer;


@Controller
public class CustomerController 
{
	@Autowired
	CustomerDao customerDao;
	
	@RequestMapping("/index")
	public String requestHandler5()
	{
		return "index1";
	}
	
	@RequestMapping("/checker")
	public String requestHandler6()
	{
		return "checker";
	}
//------------------------------------------------------------------------//	
	@RequestMapping("/insert")
	public ModelAndView insert(Customer customer)
	{  
		return new ModelAndView("addcustomer");
	
	}

	@RequestMapping("/add1")
	public ModelAndView save(@Valid Customer customer , BindingResult result)
	{   
		if(result.hasErrors())
		{
			return new ModelAndView("addcustomer");
		}
		customerDao.saveRecord(customer);
		return new ModelAndView("success");
	}
//------------------------------------------------------------------------//
	@RequestMapping("/delete")
	public ModelAndView delete(Customer customer)
	{
		
		return new ModelAndView("deleteCustomer");
	}
	@RequestMapping("/delete2")
	public ModelAndView deleterecord(@RequestParam("customer_code") String customer_code)
	{
		customerDao.deleteRecordByCustomerCode(customer_code);
		return new ModelAndView("success");
	}
//------------------------------------------------------------------------//		
	@RequestMapping("/singleview")
	public ModelAndView view1(Customer customer)
	{
		
		return new ModelAndView("View1");
	}
	@RequestMapping("/view2")
	public ModelAndView view(@RequestParam("customer_code") String customer_code)
	{
		Customer customer=customerDao.getRecordByCustomerId(customer_code);
		return new ModelAndView("Viewone","customer",customer);
	}
	//------------------------------------------------------------------------//	
	@RequestMapping("/update")
	public ModelAndView updates(Customer customer)
	{
		
		return new ModelAndView("Update1");
	}
	@RequestMapping("/update2")
	public ModelAndView updates1(@RequestParam("customer_code") String customer_code)
	{
		Customer customer=customerDao.update1(customer_code);
		return new ModelAndView("Updateone","customer",customer);
	}
	@RequestMapping("/update123")
	public ModelAndView saveupdate(@Valid Customer customer, BindingResult result)
	{  
		if(result.hasErrors())
		{
			return new ModelAndView("Updateone");
		}
		customerDao.update2(customer);
		return new ModelAndView("success");	
	}	

}
