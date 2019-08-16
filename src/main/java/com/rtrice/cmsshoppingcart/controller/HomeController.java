package com.rtrice.cmsshoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {
    // get request
    @GetMapping("/somerandompage")
    public String home() {
        return "home";
    }

}