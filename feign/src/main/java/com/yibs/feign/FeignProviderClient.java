package com.yibs.feign;

import com.yibs.entity.Student;
import com.yibs.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author liwh
 * @title: FeignProviderClient
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/9/4 14:10
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
