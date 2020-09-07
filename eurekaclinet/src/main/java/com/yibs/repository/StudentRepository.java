package com.yibs.repository;

import com.yibs.entity.Student;

import java.util.Collection;

/**
 * @author liwh
 * @title: StudentRepository
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/8/27 16:57
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public Student deleteById(long id);
}
