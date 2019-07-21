package com.maijijun.service.impl;

import com.maijijun.dao.LoginDao;
import com.maijijun.dao.impl.LoginDaoImpl;
import com.maijijun.pojo.User;
import com.maijijun.service.LoginService;

import java.sql.SQLException;

public class LoginServiceImpl implements LoginService {
    @Override
    public User chechLoginServices(String username, String pwd) throws SQLException, ClassNotFoundException {
        LoginDao ld =new LoginDaoImpl();
        return ld.checkLoginDao(username,pwd);
    }
}
