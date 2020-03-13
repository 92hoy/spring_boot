package com.spring_backend.controller.main;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class MainController{
    @RequestMapping("/main")
    public String main(HttpServletRequest request, HttpServletResponse response){
        System.out.println("hellooooo");
        request.setAttribute("message", "HelloWorld");
        return "main";
    }
}

