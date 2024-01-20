package com.tanzeel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("We are inside the base directory");
        model.addAttribute("name", "Tanzeel");
        List<String> names= new ArrayList<String>();
        names.add("Tanzeel");
        names.add("Sajid");
        names.add("Ali");

        model.addAttribute("names", names);

        return "index";
    }

//    @RequestMapping(value = "/")
//    public String home(Model model) {
//        System.out.println("Execution is in " + this.getClass().toString());
//        return "index";
//    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homeUpdated(Model model) {
        System.out.println("Execution is in " + this.getClass().toString());
        return "index";
    }
}
