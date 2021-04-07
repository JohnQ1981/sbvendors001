<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendors</title>
</head>
<body>
<h2>All Vendors</h2>
<table>
<tr>
<th>Id:</th>
<th>Address:</th>
<th>Code:</th>
<th>Name:</th>
<th>Email:</th>
<th>Phone:</th>
<th>Vendor Type:</th>
</tr>

<c:forEach  var ="vendor" items="${vendors}">
<tr>
<td>${vendor.id}</td>
<td>${vendor.address}</td>
<td>${vendor.code}</td>
<td>${vendor.name}</td>
<td>${vendor.email}</td>
<td>${vendor.phone}</td>
<td>${vendor.type}</td>
<td><a href="deleteVendor?id=${vendor.id}">Delete Vendor</a></td>
<td><a href="showUpdate?id=${vendor.id}">Edit Vendor</a></td>

</tr>
</c:forEach>
</table>
${msg}<br>
<br>
<a href="showVendors">Add Vendor</a>




</body>
</html>