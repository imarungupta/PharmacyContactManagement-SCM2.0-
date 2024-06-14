package com.pcm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        // Sending data to view
        model.addAttribute("message", "Welcome to Pharmacy Contact Management");
        model.addAttribute("video","https://www.youtube.com");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        System.out.println("about page");
        return "about";

    }
    @RequestMapping("/service")
    public String servicesPage(Model model) {
        System.out.println("services page");
        return "services";

    }
}
