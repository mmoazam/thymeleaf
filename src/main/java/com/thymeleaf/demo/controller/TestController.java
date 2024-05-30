package com.thymeleaf.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/location")
    public String getLocation(@RequestParam double latitude, @RequestParam double longitude, Model model) {
        model.addAttribute("latitude", latitude);
        model.addAttribute("longitude", longitude);
        return "location"; // Return the name of the Thymeleaf template (without .html)
    }

    @RequestMapping("")
    public String test() {
        System.out.println("test");
        return "test";
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }
}
