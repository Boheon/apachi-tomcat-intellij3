package org.galapagos.travel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Request;
import java.io.IOException;

@WebServlet("/travel_list")
public class TravelListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] names = {"홍길동","고길동","김길동"};

        req.setAttribute("names", names);

        //JSP이동
        RequestDispatcher dis = req.getRequestDispatcher("travel_list2.jsp");
        dis.forward(req,resp);


    }
}
