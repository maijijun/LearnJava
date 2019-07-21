package com.maijijun.service;

import com.maijijun.pojo.User;

import java.sql.SQLException;

public interface LoginService {
    User chechLoginServices(String username, String pwd) throws SQLException, ClassNotFoundException;
}
