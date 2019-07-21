package com.maijijun.dao.impl;

import com.maijijun.dao.LoginDao;
import com.maijijun.pojo.User;

import java.sql.*;



public class LoginDaoImpl implements LoginDao {
    @Override
    public User checkLoginDao(String username, String pwd) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement stmt =null;
        ResultSet res = null;

        User u =null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT","root","maijijun" );

        String sql ="select * from t_user where username=? and pwd =? ";
        stmt= conn.prepareStatement(sql);
        stmt.setString(1,username);
        stmt.setString(2,pwd);
        res=stmt.executeQuery();


        while(res.next()){
            u = new User();
            u.setUsername(res.getString("username"));
            u.setPwd(res.getString("pwd"));
        }
        res.close();
        stmt.close();
        conn.close();
        return u;
    }
}
