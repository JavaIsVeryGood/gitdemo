package com.example.demo.controller;

import com.example.demo.properties.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    TestProperties testProperties;

    @RequestMapping("/")
    @ResponseBody
    public String test(){


        return testProperties.getName()+"  hello";
    }
}
