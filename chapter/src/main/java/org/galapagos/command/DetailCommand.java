package org.galapagos.command;

import org.galapagos.vo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DetailCommand implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Detail Command");
        String userid = request.getParameter("userid");

        //userid를 db에 검색
        User user = new User(userid, "1234", userid+"@naver.com");

        //user라는 이름으로 request스코프에 저장
        request.setAttribute("user", user);

        return "detail";
    }
}
