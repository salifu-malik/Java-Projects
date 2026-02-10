package com.mankind.firstWebProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order")
    public String order(@RequestParam String Item) {
        return "Your order for "+ Item + " has been received";

    }
}
