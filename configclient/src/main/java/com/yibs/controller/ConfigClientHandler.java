package com.yibs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwh
 * @title: ConfigClientHandler
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/9/8 14:03
 */
@RestController
@RequestMapping("/remote")
public class ConfigClientHandler {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return port;
    }
}
