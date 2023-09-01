<%--
  Created by IntelliJ IDEA.
  User: 박보헌
  Date: 2023-09-01
  Time: 오후 3:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var = "userid" value = "admin" scope = "session"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="container">
         <h1>
             로그인 성공
         </h1>
        <a href = "visit.jsp">visit</a>
    </div>
</body>
</html>
