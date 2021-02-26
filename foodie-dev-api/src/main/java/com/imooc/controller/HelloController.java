package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author:Nhx
 * @description
 * @date:2021-02-23
 */
@RestController
@ApiIgnore
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
