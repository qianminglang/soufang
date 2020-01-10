package com.asiainfo.soufang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qml
 * @date 2020/1/10 0010 23:35
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        System.out.println("搜房网启动");
        model.addAttribute("name","ocj");
        return "index";
    }
}
