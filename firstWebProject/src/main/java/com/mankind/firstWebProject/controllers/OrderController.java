package com.mankind.firstWebProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping("/order")
    public String order(Model model) {
        model.addAttribute("food", "Fufu" );
        return "order";

    }
}
