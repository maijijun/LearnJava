package com.maijijun.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLife",urlPatterns = "/servletlife",loadOnStartup = 1)
public class ServletLife extends HttpServlet {
    @Override
    //在servlet第一次被加载到内存时调用
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet 初始化完成！！！");
    }

    @Override
    //servlet处理请求
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("servlet life");
        System.out.println("servlet life");
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy！！！");
    }
}
