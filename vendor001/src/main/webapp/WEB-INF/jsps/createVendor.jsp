<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveVendor" method="post">
<pre>
Id:<input type="text" name="id" /> <br>
Address:<input type="text" name="address" /> <br>
Code:<input type="text" name="code" /> <br>
Name:<input type="text" name="name" /> <br>
Email:<input type="text" name="email" /> <br>
Phone:<input type="text" name="phone" /> <br>
Vendor Type:
Contract<input type="radio"	name="type" value="CONTRACT"/> 
	    Regular<input type="radio" name="type" value="REGULAR"/>
	 <input	type="submit" value="save" />




</pre>
</form>
<a href="displayVendors">View All Vendors</a>
</body>
</html>