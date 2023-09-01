package org.galapagos.vo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/vo")
public class VoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Member admin = new Member("admin", "관리자");

        req.setAttribute("user", admin);

        RequestDispatcher dis = req.getRequestDispatcher("el03.jsp");
        dis.forward(req, resp);
    }
}
