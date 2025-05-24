package com.shashank.todo_app.Services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean isAuthenticated(String username , String password) {

        return username.equals("Shashank") && password.equals("123");

    }

}
