package com.yibs.com.yibs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwh
 * @title: controller
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/9/8 15:08
 */
@RestController
@RequestMapping("/zipkinclient")
public class controller {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return port;
    }
}
