package com.maijijun.dao;

import com.maijijun.pojo.User;

import java.sql.SQLException;

public interface LoginDao {
    User checkLoginDao(String username,String pwd) throws ClassNotFoundException, SQLException;
}
