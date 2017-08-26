<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Prigovor
  Date: 24.08.2017
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/static/css/style.css"/>"/>
</head>
<body>

<h1>Welcome to Spittr</h1>

<a href="<c:url value="/spittles"/>">Spittles</a>
<a href="<c:url value="/spitter/register"/>">Register</a>

</body>
</html>
