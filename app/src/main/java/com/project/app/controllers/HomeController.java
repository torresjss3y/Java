package com.project.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Página de inicio (index)
    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("pageTitle", "Dashboard Nexus");
        model.addAttribute("userName", "Usuario");
        model.addAttribute("userEmail", "usuario@ejemplo.com");
        model.addAttribute("userAvatar", "https://flowbite.com/images/people/profile-picture-5.jpg");
        model.addAttribute("activeTab", "dashboard");
        model.addAttribute("totalSales", "$24,500");
        model.addAttribute("salesGrowth", "+12.5%");
        model.addAttribute("newUsers", "+1,240");
        model.addAttribute("usersGrowth", "+8.2%");
        model.addAttribute("conversionRate", "3.42%");
        model.addAttribute("conversionChange", "-1.4%");
        model.addAttribute("pendingOrders", "398");
        model.addAttribute("ordersGrowth", "+3.2%");
        return "home/dashboard";
    }

    @GetMapping("/productos")
    public String productos(Model model) {
   
        return "productos"; 
    }
}
