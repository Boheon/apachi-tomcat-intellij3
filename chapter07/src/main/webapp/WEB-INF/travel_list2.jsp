<%--
  Created by IntelliJ IDEA.
  User: 박보헌
  Date: 2023-09-01
  Time: 오전 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language ="java" contentType="text/html;charset=UTF-8"  
pageEncoding="UTF-8" %>

<%@ include file = "header.jsp"%>
<%
    String[] names = (String[]) request.getAttribute("names");
%>

<body>
    <div class="container">
        <h1>
            목록보기
        </h1>
        <% for(String name : names){ %>
        <%=name%> <br>
        <%}%>
    </div>
</body>
<%@ include file="footer.jsp"%>
