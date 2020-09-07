package com.yibs.conroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwh
 * @title: NativeConfigClientHandler
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/9/7 16:47
 */
@RestController
@RequestMapping("/native")
public class NativeConfigClientHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return this.port+this.foo;
    }

}
