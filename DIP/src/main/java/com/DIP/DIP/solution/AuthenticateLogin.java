package com.DIP.DIP.solution;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class AuthenticateLogin {
    private  Authentication authentication;
      
    public boolean login(User user){
        return authentication.login(user);
    }
    
}
