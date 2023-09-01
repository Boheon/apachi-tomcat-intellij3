<%--
  Created by IntelliJ IDEA.
  User: 박보헌
  Date: 2023-09-01
  Time: 오후 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib  uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="page" value="1" scope = "request"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h1>
        Page: ${pageScope.page} / ${requestScope.page}/${page}
    </h1>
    <c:out value = "${page}"/> / <c:out vlaue = "page"/>
    <c:remove var = "page"/>
    (${page})
</div>
</body>
</html>
