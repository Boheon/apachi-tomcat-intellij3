<%--
  Created by IntelliJ IDEA.
  User: 박보헌
  Date: 2023-09-01
  Time: 오후 3:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSTL CORE 라이브러리 실습</h1>
    <c:set var="myColor" value = "빨강"/>
    <c:if test="${myColor != '빨강'}">
        색상은 빨강색이 아닙니다.
    </c:if>
</body>
</html>
