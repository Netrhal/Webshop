package com.gfa.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/webshop", "/"})
    public String getWebshop() {
        return "webshop";
    }
}
