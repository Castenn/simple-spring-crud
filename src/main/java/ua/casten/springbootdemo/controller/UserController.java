package ua.casten.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.casten.springbootdemo.model.User;
import ua.casten.springbootdemo.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "";
    }
}
