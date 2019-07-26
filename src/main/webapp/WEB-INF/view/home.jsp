<%--
  Created by IntelliJ IDEA.
  User: ewkra
  Date: 21.07.2019
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/search-by-id" method="post">
    Enter Student Id:
    <input type="text" name="studentId"/>
    <input type="submit" value="Search"/>
</form>

<form action="${pageContext.request.contextPath}/search-by-lastName" method="post">
    Enter Student Last Name:
    <input type="text" name="lastName"/>
    <input type="submit" value="Search"/>
</form>

<form action="${pageContext.request.contextPath}/add-student" method="post">
    Enter Student First Name:
    <input type="text" name="firstName"/>
    Enter Student Last Name:
    <input type="text" name="lastName"/>
    Enter Student Id:
    <input type="text" name="id"/>
    <input type="submit" value="Add"/>
</form>

</body>
</html>
