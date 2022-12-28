<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
<h2>create new lead</h2>
<form action="updateLead" method ="post">
<pre>
<input type="hidden" name="id" value="${lead.id}"/>
FIRSTNAME<input type="text" name="firstName" value="${lead.firstName}"/>
LASTNAME<input type="text" name="lastName"value="${lead.lastName}"/>
EMAIL ID<input type="text" name="email"value="${lead.email}"/>
MOBILE NO<input type="text" name="mobile"value="${lead.mobile}"/>
<input type="submit" value="update"/>

</pre>

</form>

${msg} 
</body>
</html>