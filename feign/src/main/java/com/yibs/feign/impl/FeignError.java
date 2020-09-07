package com.yibs.feign.impl;

import com.yibs.entity.Student;
import com.yibs.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author liwh
 * @title: FeignError
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/9/4 14:28
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务围护中。。。";
    }
}
