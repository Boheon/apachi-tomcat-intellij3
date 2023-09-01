<%--
  Created by IntelliJ IDEA.
  User: 박보헌
  Date: 2023-09-01
  Time: 오후 3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<$@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>

<div class="text-right mr-5">
    <hr>
    <c:if test="${not empty userid}">
        ${userid} (<a href="logout.jsp">로그아웃</a>)
    </c:if>

    <c:if test="${empty userid}">
        <a href="login.jsp">로그인</a>
    </c:if>
    <hr>
</div>