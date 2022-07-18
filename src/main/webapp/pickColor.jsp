<%--
  Created by IntelliJ IDEA.
  User: levengrim
  Date: 7/14/22
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="pickcolor">
<input type="text"  id="color" name="color" >
    <label for="color">What your favorite color?</label>
    <a href="viewcolor">
    <button type="submit">Submit</button>
    </a>
</form>
<%@include file="partials/Jquery.jsp"%>
</body>
</html>
