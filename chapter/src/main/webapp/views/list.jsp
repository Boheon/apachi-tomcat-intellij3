<%--
  Created by IntelliJ IDEA.
  User: 박보헌
  Date: 2023-09-04
  Time: 오후 4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" tagdir=""%>

<div class = "container">
    <hi>
        목록보기
    </hi>

    <table>
        <thead>
            <tr>
                <th>UserID</th>
                <th>비밀번호</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${users}">
            <tr>
                <td><a href ="detail.do?userid=${user.userid}">${user.userid}</a></td>
                <td>${user.password}</td>
                <td>${user.email}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>