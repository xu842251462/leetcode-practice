package com.sincere.Demo.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sincere.Demo.model.User;
import com.sincere.Demo.service.UserService;
import com.sincere.Demo.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //check for service layer
        userService.checkUser(username, password);

        return "anything";
    }

    @GetMapping("signup")
    public String signup(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        userService.insert(username, password);

        return "success";

    }


}