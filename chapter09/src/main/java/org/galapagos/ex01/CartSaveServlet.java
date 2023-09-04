package org.galapagos.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/cartsave")
public class CartSaveServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");//response문자셋 설정
        
        PrintWriter out = resp.getWriter();

        //입력 파라미터 얻기
        String product = req.getParameter("product");
        System.out.println(product);

        //세션객체 얻기
        HttpSession session = req.getSession();
        ArrayList<String> list = (ArrayList<String>) session.getAttribute("product");

        if(list == null){//처음 꺼냄
            list = new ArrayList<String>();
            list.add(product);
            session.setAttribute("product", list);//session scope
        } else{//예전에 속성 추가 함
            list.add(product);
        }
        out.print("<html><body>");
        out.print("Product 추가");
        out.print("<a href = 'CartBasket'>장바구니 보기</a>");
        out.print("</body></html>");
    }
}
