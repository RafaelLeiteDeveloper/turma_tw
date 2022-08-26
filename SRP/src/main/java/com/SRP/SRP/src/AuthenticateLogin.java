package com.SRP.SRP.src;

import java.sql.Connection;

public class AuthenticateLogin {

    public boolean login(User user) {
        ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
        Connection connection = connectionDAO.createConnection();
        //realiza o login do usuário no sistema
        return true;
    }
    
}
