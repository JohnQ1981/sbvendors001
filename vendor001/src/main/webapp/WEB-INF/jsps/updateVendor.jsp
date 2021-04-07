<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateVendor" method="post">
<pre>

Id:<input type="text" name="id" value="${vendor.id}" readonly/> <br>
Address:<input type="text"	name="address" value="${vendor.address}" /><br>
Code:<input type="text"	name="code" value="${vendor.code}" /><br>
Name:<input type="text" name="name" value="${vendor.name}" /> <br>
Email:<input type="text" name="email" value="${vendor.email}" /> <br>
Phone:<input type="text" name="phone" value="${vendor.phone}" /> <br>
Vendor Type: Contract<input type="radio"	name="type" value="CONTRACT" ${vendor.type=='CONTRACT'?'checked':''}/> 
	Regular<input type="radio" name="type" value="REGULAR" ${vendor.type=='REGULAR'?'checked':''}/>
	 <input	type="submit" value="save" />
</pre>
	</form>
	${msg}


</pre>

</form>
</body>
</html>