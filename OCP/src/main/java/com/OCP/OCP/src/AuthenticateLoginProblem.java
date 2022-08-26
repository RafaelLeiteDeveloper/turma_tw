package com.OCP.OCP.src;

import java.sql.Connection;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class AuthenticateLoginProblem {

    public boolean login(User user, String provider){
        ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
        Connection connection = connectionDAO.createConnection();

        if(provider.equalsIgnoreCase("Linkedin")){
            //autêntica o login com o Oauth Linkedin
        }
        else{
            //autêntica o login com informações do banco de dados
        }

        return true;
    }
    
}
