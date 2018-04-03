package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/3/29.
 */
@RestController
public class hello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){

            return "HelloSpringBoot!";
    }
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi () {
        return "HelloWord!!!";
    }
}