package com.asiainfo.soufang.web.controller;

import com.asiainfo.soufang.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

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

    @GetMapping("/get")
    @ResponseBody
    public ApiResponse getApiResponse(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("name","qml");
        return ApiResponse.ofSuccess(map);
    }

}
