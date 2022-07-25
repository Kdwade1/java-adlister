<%--
  Created by IntelliJ IDEA.
  User: levengrim
  Date: 7/25/22
  Time: 12:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>These are you're results for ${search}</h1>
<c:forEach var="ad" items="${ads}">
    <div class="col-md-6">
        <h2>${ad.title}</h2>
        <h2>${ad.category}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
