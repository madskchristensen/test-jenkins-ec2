package com.madskchristensen.testjenkinsec2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/jenkins")
    public String jenkinsLandingPage() {
        return "redirect:127.0.0.1:8080";
    }
}