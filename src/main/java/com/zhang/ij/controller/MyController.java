package com.zhang.ij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/developer")
public class MyController {
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }
}
