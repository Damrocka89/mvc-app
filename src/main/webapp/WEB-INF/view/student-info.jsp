<%--
  Created by IntelliJ IDEA.
  User: ewkra
  Date: 21.07.2019
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<h1>

    <c:forEach items="${students}" var="student">
        Student id = ${student.id}; first name = ${student.firstName}; last name = ${student.lastName}<br>
    </c:forEach>

</h1>

</body>
</html>
