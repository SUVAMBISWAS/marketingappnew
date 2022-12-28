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
<form action="saveLead" method ="post">
<pre>

FIRSTNAME<input type="text" name="firstName"/>
LASTNAME<input type="text" name="lastName"/>
EMAIL ID<input type="text" name="email"/>
MOBILE NO<input type="text" name="mobile"/>
<input type="submit" value="save"/>

</pre>

</form>

${msg} 
</body>
</html>