package org.galapagos.controller;

import org.galapagos.command.Command;
import org.galapagos.command.DetailCommand;
import org.galapagos.command.ListCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Map<String, Command> commandMap = new HashMap<>();
    String prefix = "views/";//view이름의 접두어
    String surfix = ".jsp";//view이름의 접미어

    public FrontControllerServlet(){
        commandMap.put("/list.do", new ListCommand());
        commandMap.put("/detail.do", new DetailCommand());
    }




    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length());

        Command cmd = commandMap.get(command);
        String view;

        if(cmd != null){
            view = cmd.execute(request, response);
        }else{//404error
            view = "404";
        }

        String target = prefix + view + surfix;
        //view로 forwarding
        RequestDispatcher dis = request.getRequestDispatcher(target);
        dis.forward(request, response);

        if (command.equals("/insert.do")) {
            System.out.println("insert 요청");
        } else if (command.equals("/delete.do")) {
            System.out.println("delete 요청");
        } else if (command.equals("/update.do")) {
            System.out.println("update 요청");
        } else {
            System.out.println("select 요청");
        }
    }
}
