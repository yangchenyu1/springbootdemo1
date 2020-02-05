package com.action;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@RestController

public class act {
    @RequestMapping(value = "check_act.do",method = RequestMethod.GET)
    public String check(HttpServletRequest request, HttpServletResponse response){

        return "这是一个Springboot项目!!!";

    }
}
