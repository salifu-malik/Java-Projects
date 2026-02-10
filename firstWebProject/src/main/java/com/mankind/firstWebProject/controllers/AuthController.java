package com.mankind.firstWebProject.controllers;

import org.springframework.ui.Model;

import com.mankind.firstWebProject.User;
import com.mankind.firstWebProject.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserRepository repo;

    //Show Signup Page
    @GetMapping("/signup")
    public String signupPage(Model model) {
        model.addAttribute("user", new User());
        return "signup";

    }

    //Handle SignUp
    @PostMapping("/signup")
    public String signup(User user){
       repo.save(user);
       return "redirect:/login";
    }

    //Show Login Page
    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }

    //Handle login
    @PostMapping("/login")
    public String login(String email, String password, Model model) {
        User user = repo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return "redirect:/dashboard";

        }
        model.addAttribute("error", "Invalid username or password");
        return "login";

        }


    //Show Dashboard
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
    }





