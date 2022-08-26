package com.DIP.DIP.solution;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface Authentication {
    boolean login(User user);
}
