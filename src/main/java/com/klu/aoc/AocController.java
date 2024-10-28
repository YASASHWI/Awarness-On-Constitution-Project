package com.klu.aoc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AocController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}