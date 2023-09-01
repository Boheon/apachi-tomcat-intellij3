package org.galapagos.ex1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/el")
public class ElServlet extends HttpServlet {
    private static final long serialVerionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> member = new HashMap<>();
        member.put("name", "홍길동");
        member.put("userid", "hong");
        
        //request 스코프에 "member"라는 속성명으로 저장
        req.setAttribute("member", member);

        RequestDispatcher dis = req.getRequestDispatcher("el02.jsp");
        dis.forward(req, resp);
    }
}
