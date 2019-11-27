package com.example.demo.controller;

import com.example.demo.properties.TestProperties;
import com.example.demo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    TestProperties testProperties;

    @Autowired
    AsyncService asyncService;

    @RequestMapping("/")
    @ResponseBody
    public String test(){


        return testProperties.getName()+"  hello";
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        asyncService.hello();
        return "hello";
    }
}
