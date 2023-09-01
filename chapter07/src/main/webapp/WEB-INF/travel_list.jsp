<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset = UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: 박보헌
  Date: 2023-09-01
  Time: 오전 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Context ctx = new InitialContext();
    DataSource dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
    Connection con = dataFactory.getConnection();

    //페이지1의 목록 얻기 sql
    String sql = "SELECT * FROM TRAVEL LIMIT ?, ?";

    PreparedStatement stmt = con.prepareStatement(sql);
    stmt.setInt(1,0);
    stmt.setInt(2, 10);

    //SELECT QUERY --> executeQuery
    //Input, update, delete --> executeUpdate()
    ResultSet rs = stmt.executeQuery();


%>
<html>

<body>
<div class="container">
    <h1>100대 관광지 목록 보기</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>No</th>
            <th>권역</th>
            <th>title</th>
        </tr>
        </thead>
        <tbody>
        <%
            while(rs.next()){
                int no = rs.getInt("no");
                String region = rs.getString("region");
                String title = rs.getString("title");
        %>
        <tr>
            <td><%=no%></td>
            <td><%=region%></td>
            <td><%=title%></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
