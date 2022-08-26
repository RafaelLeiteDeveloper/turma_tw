package com.DIP.DIP.problem;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class AuthenticateLogin {
    
    public boolean login(User user){
        AuthenticationLinkedin authentication = new AuthenticationLinkedin();
        return authentication.login(user);
    }
    
}
