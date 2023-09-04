package org.galapagos.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CartSaveCookie")
public class CartSaveCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
// 입력 파라미터 얻기
        String product = request.getParameter("product");
//기존 쿠키 얻기
        Cookie[] cookies = request.getCookies();//브라우저가 전송쿠키 추출
        Cookie c = null;
        if (cookies == null || cookies.length == 0) {//쿠키없는 경우
            c = new Cookie("product", product);
        } else {
            c = new Cookie("product" + (cookies.length + 1), product);
        }
        //쿠키를 응답처리
        c.setMaxAge(60*60);//단위는 초. 60x60-->1시간
        response.addCookie(c);//response의 헤더 추가
        out.print("<html><body>");
        out.print("Product 추가");
        //out.print("<a href='CartBasketCookie'>장바구니 보기</a>");
        out.print("<a href=" + response.encodeURL("CartBasketCookie") +
                ">장바구니 보기</a>");
        out.print("</body></html>");
    }
}
