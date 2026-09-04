package com.project.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Página de inicio (index)
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Dashboard");
        return "home/dashboard";
    }
    
    // Dashboard
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("pageTitle", "Dashboard");
        return "home/dashboard";
    }

}
