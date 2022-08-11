<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alisher
  Date: 10.08.2022
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="saveIce" modelAttribute="ice">
    <p style=" text-align: center; margin-top:200px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">
    IceCream name<form:input cssStyle="
    border: 1px solid #d64374;width: 150px" path="name"/>


    How many<form:input cssStyle="
    border: 1px solid #d64374;width: 150px" path="number"/>

    <br><br>
    <input style="background:#D23166; border-radius: 5px;color: #fafafa;font-size: 20px;width: 80px" type="submit" value="add">
    </p>

</form:form>
</body>
</html>
