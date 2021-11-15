package com.qh.hotelsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {
    @GetMapping("/top")
    public String index_top(){

        return "detail/top";
    }
    @GetMapping("/left")
    public String index_left(){

        return "detail/left";
    }
    @GetMapping("/right")
    public String index_right(){

        return "detail/right";
    }
    @GetMapping("/bottom")
    public String index_bottom(){

        return "detail/bottom";
    }

}
