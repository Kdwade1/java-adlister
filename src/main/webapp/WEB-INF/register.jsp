<%--
  Created by IntelliJ IDEA.
  User: levengrim
  Date: 7/21/22
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="register"method="post">
  <label for="username">Enter a username</label>
  <input type="text"id="username" name="username">
  <br>
  <label for="email">Enter your email</label>
  <input type="email" id="email"name="email">

    <br>
    <label for="password">Enter a password</label>
    <input type="password"id="password" name="password">

  <button type="submit">Register!</button>

</form>

</body>
</html>
