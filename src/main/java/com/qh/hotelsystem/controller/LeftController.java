package com.qh.hotelsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeftController {
    @GetMapping("/cuisineList")
    public String cuisineList(){

        return "detail/cuisineList";
    }

    @GetMapping("/foodList")
    public String left_foodList(){

        return "detail/foodList";
    }



}
