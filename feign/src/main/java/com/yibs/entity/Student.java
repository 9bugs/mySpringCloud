package com.yibs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liwh
 * @title: Student
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/8/27 16:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
