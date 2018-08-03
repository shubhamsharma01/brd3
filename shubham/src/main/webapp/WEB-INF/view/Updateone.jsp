<%-- <%@include file="src/main/java/com/nucleus/model/Customer.java" %> --%>
<%@page import="com.nucleus.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="index1.jsp" %>

<s:form action="update123" modelAttribute="customer"><br>
<table border="5" align="center" >
<tr><td><b>Customer Code </b></td><td> <s:input path="customer_code" value="${customer.customer_code}"/><s:errors path="customer_code"/></td></tr>
<tr><td><b>Customer Name </b></td><td> <s:input path="customer_name" value="${customer.customer_name}"/><s:errors path="customer_name"/></td></tr>
<tr><td><b>Customer Address1 </b></td><td> <s:input path="customer_address1" value="${customer.customer_address1}"/><s:errors path="customer_address1"/></td></tr>
<tr><td><b>Customer Address2 </b></td><td> <s:input path="customer_address2" value="${customer.customer_address2}"/><s:errors path="customer_address2"/></td></tr>
<tr><td><b>Customer Pin code </b></td><td> <s:input path="customer_pinCode" value="${customer.customer_pinCode}"/><s:errors path="customer_pinCode"/></td></tr>
<tr><td><b>Customer Email Address</b></td><td>  <s:input path="email_address" value="${customer.email_address}"/><s:errors path="email_address"/></td></tr>
<tr><td><b>Customer Contact number </b></td><td> <s:input path="contact_number" value="${customer.contact_number}"/><s:errors path="contact_number"/></td></tr>
<tr><td><b>Customer Contact Person </b></td><td> <s:input path="primaryConatctPerson" value="${customer.primaryConatctPerson}"/><s:errors path="primaryConatctPerson"/></td></tr>
<tr><td><b>Customer Record Status</b></td><td> <s:input path="record_status" value="${customer.record_status}"/><s:errors path="record_status"/></td></tr>
<tr><td><b>Customer Flag Status</b></td><td> <s:input path="active_inactiveFlag" value="${customer.active_inactiveFlag}"/><s:errors path="active_inactiveFlag"/></td></tr>
</table>

<br>
<br>
<center><input type="submit" value="Update" name="submit"></center>

</s:form>
</body>
</html>