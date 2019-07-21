package com.maijijun.dao.impl;

import com.maijijun.dao.LoginDao;
import com.maijijun.pojo.User;

import java.sql.*;

import static java.lang.Class.forName;


public class LoginDaoImpl implements LoginDao {
    @Override
    public User checkLoginDao(String username, String pwd) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt =null;
        ResultSet res = null;

        User u =null;
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","maijijun");

        String sql ="select username,pwd from db1.t_user";
        stmt= conn.createStatement();

        res=stmt.executeQuery(sql);
        System.out.println(res);
        while(res.next()){
            u = new User();
            u.setUid(res.getInt("uid"));
            u.setUsername(res.getString("username"));
            u.setPwd(res.getString("pwd"));
        }
        res.close();
        stmt.close();
        conn.close();

        return u;
    }
}
