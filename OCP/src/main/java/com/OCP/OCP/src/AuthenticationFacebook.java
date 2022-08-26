package com.OCP.OCP.src;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class AuthenticationFacebook implements Authentication {
    @Override
    public boolean login(User user) {
        //autêntica o login com o Oauth Facebook.
        return false;
    }
}