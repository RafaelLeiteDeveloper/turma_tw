package com.OCP.OCP.src;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface Authentication {
    boolean login(User user);
}
