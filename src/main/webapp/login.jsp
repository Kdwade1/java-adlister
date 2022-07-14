<%--
  Created by IntelliJ IDEA.
  User: levengrim
  Date: 7/13/22
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! String username;%>
<%! String password;%>
<% if (request.getParameter("username") != null)
    username = request.getParameter("username");
%>
<% if (request.getParameter("password") != null)
    password = request.getParameter("password");
%>
<html>
<head>
    <style>
        <%@include file="/css/main.css" %>
    </style>
    <title>Title</title>
</head>
<body>
<form action="login.jsp" method="post">
    <%--    <c:if test=""></c:if>--%>
    <label for="username"> Enter your username</label>
    <input id="username" type="text" name="username">

    <label for="password"> Enter your password</label>
    <input id="password" type="password" name="password">
    <button type="submit">Submit</button>
    <c:if test="${(param.username != null) && (param.password != null)}">
        <c:choose>
            <c:when test='${(param.username.equals("admin")) && (param.password.equals("password"))}'>
                <%response.sendRedirect("/profile.jsp");%>
            </c:when>
<c:otherwise>
    <%response.sendRedirect("/login.jsp");%>
</c:otherwise>
        </c:choose>
    </c:if>



</form>

</body>
</html>
