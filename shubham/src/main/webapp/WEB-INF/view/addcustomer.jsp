<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
</head>

<script>

</script>

<body>
<%@include file="index1.jsp" %>



<h1><center>Insert New Record</center></h1>
<s:form action="add1" modelAttribute="customer">
<table border="5" align="center" >
<tr><td width="10" height="10">Customer Id:</td><td><s:input path="customer_id" /><s:errors path="customer_id"/></td></tr> 
<tr><td>Customer Code:</td><td><s:input  path="customer_code" /><s:errors path="customer_code"/></td></tr>
<tr><td>Customer Name:</td><td><s:input path="customer_name" /><s:errors path="customer_name"/></td></tr>
<tr><td>Customer Address 1:</td><td><s:input path="customer_address1" /><s:errors path="customer_address1"/></td></tr>
<tr><td>Customer Address 2:</td><td><s:input path="customer_address2" /><s:errors path="customer_address2"/></td></tr>
<tr><td>Customer Pin Code:</td><td><s:input path="customer_pinCode" /><s:errors path="customer_pinCode"/></td></tr>
<tr><td>E-mail address:</td><td><s:input path="email_address" /><s:errors path="email_address"/></td></tr>
<tr><td>Contact number:</td><td><s:input path="contact_number" /><s:errors path="contact_number"/></td></tr>
<tr><td>Primary Contact Person:</td><td><s:input path="primaryConatctPerson" /><s:errors path="primaryConatctPerson"/></td></tr>


<tr><td>Record Status:</td>
<td>
<s:select path="record_status">
<s:option value="N">N</s:option>
<s:option value="M">M</s:option>
<s:option value="A">A</s:option>
<s:option value="D">D</s:option>
<s:option value="R">R</s:option>
</s:select>
</td>
</tr>


<%-- <td>N<s:radiobutton path="record_status" value="N" /><s:errors path="record_status"/>
M<s:radiobutton path="record_status" value="M" /> D<s:radiobutton path="record_status" value="D" /> 
 A<s:radiobutton path="record_status" value="A" /> R<s:radiobutton path="record_status" value="R" /></td></tr> 
 --%>
 
 
 <tr><td>Active/Inactive Flag:</td>
<td>
<s:select path="active_inactiveFlag">
<s:option value="A">A</s:option>
<s:option value="I">I</s:option>
</s:select>
</td>
</tr>
 
 
 
 
 
<%-- <tr><td>Active/Inactive Flag:</td><td>A<s:radiobutton path="active_inactiveFlag" value="A" /><s:errors path="active_inactiveFlag"/>
 I<s:radiobutton path="active_inactiveFlag" value="I" /></td></tr>
 --%>
<tr><td></td><td><input type="submit" value="submit details" /></td></tr>

</table>
</s:form>
</body>
</html> 





