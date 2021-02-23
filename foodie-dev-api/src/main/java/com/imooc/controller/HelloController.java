package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Nhx
 * @description
 * @date:2021-02-23
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
