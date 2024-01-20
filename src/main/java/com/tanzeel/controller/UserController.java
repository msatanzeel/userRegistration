package com.tanzeel.controller;

import com.tanzeel.repository.entities.User;
import com.tanzeel.service.UserServiceImpl;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Setter
public class UserController {

    UserServiceImpl userServiceImpl;
    @RequestMapping(value = "/submit_form", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model) {
        System.out.println("The user details are as follows: " + user);
        userServiceImpl.registerUser(user);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        System.out.println("inside the login controller");
        return "login";
    }

}
