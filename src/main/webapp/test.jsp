<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% System.out.println("Hello world");%>
<%! String color;%>
<% if(request.getParameter("color")!=null)
    color = request.getParameter("color");
%>

<%
    List<String> trails =new ArrayList<>();
    trails.add("Leon Creek Greenway");
    trails.add("Geology Trail");
    trails.add("Salado Creek Greenway");
%>
<%request.setAttribute("trails",trails); %>
<% request.setAttribute("numbers","1,2,3,4,5");%>

<html>
<head>

    <title>Title</title>
</head>
<body>
<%--<%@ include file="partials/navbar.jsp" %>--%>
<h1>BOOOOOO</h1>
<form action ="test.jsp" method ="post">
    <label for="color">What is your favorite color</label>
    <input type= "text" id=color name = "color" value="blue"/>
    <button type="submit">Submit</button>
</form>
<c:if test= "${param.color!=null}">
    <p>Your favorite color is:${param.color}</p>
</c:if>

<ul>
    <c:forEach var = "trail" items ="${trails}">
        <li>${trail}</li>
    </c:forEach>
</ul>
<c:if test="${param.color != null}">
    <c:choose>
        <c:when test='${param.color.equalsIgnoreCase("blue")}'>
            <h1> Whoa blue is my favorite color too!</h1>
        </c:when>
        <c:otherwise>
            <h1>  Eh ..${param.color} is a cool color however blue cooler!</h1>
        </c:otherwise>
    </c:choose>
</c:if>

<c:if test='${(param.color.equalsIgnoreCase("red")) || (param.color.equalsIgnoreCase("green"))}'>
    <h1> Hello loser!</h1>
</c:if>
</body>
</html>
