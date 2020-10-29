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
        return "redirect:http://ec2-3-234-243-241.compute-1.amazonaws.com/:8080";
    }
}