package com.shashank.todo_app.Controllers;

import com.shashank.todo_app.Services.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
public class LoginController {

    AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping( value = "/login" , method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping( value = "/login" , method = RequestMethod.POST)
    public String WelcomePage(@RequestParam String username , @RequestParam String password , ModelMap modelMap) {

        modelMap.put("username" , username);

        if(authenticationService.isAuthenticated(username , password)) {
            return "welcome";
        }
        modelMap.put("error" , "Invalid Credentials Try Again!");
        return "login";
    }
}