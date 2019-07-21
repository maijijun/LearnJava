package com.maijijun.servlet;

import com.maijijun.pojo.User;
import com.maijijun.service.LoginService;
import com.maijijun.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        String username=req.getParameter("username");
        String pwd=req.getParameter("pwd");
        System.out.println(username+":"+pwd);

        LoginService ls =new LoginServiceImpl();
        try {
            User u = ls.chechLoginServices(username,pwd);
            System.out.println(u);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}