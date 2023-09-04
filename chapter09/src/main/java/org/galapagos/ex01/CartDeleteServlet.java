package org.galapagos.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CartDelete")
public class CartDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("장바구니 비웠음!!");
//세션객체 얻기
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        } else {
            out.print("세션 없음" + "<br>");
        }
        out.print("<a href='product.html'>상품 선택 페이지</a><br>");
        out.print("<a href = 'cartdelete'>상품 취소하기</a><br>");
        out.print("</body></html>");
    }
}
