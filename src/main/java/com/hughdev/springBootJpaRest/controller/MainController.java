package com.hughdev.springBootJpaRest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/","/index","/main"})
    public String main(Model model){

        String name = "이름";
        model.addAttribute("name", name);

        return "/main";
    }

}
