package org.galapagos.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cartbasketcookie")
class CartBasketCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("장바구니 리스트<br>");
        //기존 쿠키 얻기
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.print(c.getName() + " : " + c.getValue() + "<br>");
            }
        } else {
            out.print("장바구니 비었음<br>");
        }
        out.print("<a href='product.html'>상품 선택 페이지</a><br>");
        out.print("<a href='CartDeleteCookie'>장바구니 비우기</a><br>");
        out.print("</body></html>");
    }
}