package com.madskchristensen.testjenkinsec2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model, HttpServletRequest request) {
        model.addAttribute("request", request);
        return "index";
    }

    @GetMapping("/jenkins")
    public String jenkinsLandingPage() {
        return "redirect:http://54.81.145.200:8080/";
    }
}