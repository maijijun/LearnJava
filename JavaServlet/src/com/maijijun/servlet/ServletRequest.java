package com.maijijun.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "ServletRequest",urlPatterns = "/request")
public class ServletRequest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getMethod();
        System.out.println(method);
        StringBuffer url = req.getRequestURL();
        System.out.println(url);
        String scheme = req.getScheme();
        System.out.println(scheme);

        String value =req.getHeader("Content-Type");
        System.out.println(value);
        Enumeration<String> e = req.getHeaderNames();
        while(e.hasMoreElements()){
            String name = e.nextElement();
            String value2 = req.getHeader(name);
            System.out.println(value2);
        }


        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        System.out.println(username);
        System.out.println(pwd);
        resp.setContentType("text/html;charset=utf-8 ");
        resp.getWriter().write("welcome to servlet");
        resp.getWriter().write("欢迎！！！");
       // super.service(req,resp);
    }
}
