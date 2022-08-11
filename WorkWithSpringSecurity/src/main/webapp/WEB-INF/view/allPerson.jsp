<%--
  Created by IntelliJ IDEA.
  User: Alisher
  Date: 10.08.2022
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<security:authorize access="hasRole('MANAGER')">
<input style="
    margin-top: 200px;
    margin-left: 200px;
    background:#D23166;
    border-radius: 5px;
    font-family: 'Hind Madurai', sans-serif;
    transition: 0.8s;
    text-decoration: none;
    font-size: 16px;" type="button" value="Only for admin" onclick="window.location.href='addIce'">
</security:authorize>

</body>
</html>
