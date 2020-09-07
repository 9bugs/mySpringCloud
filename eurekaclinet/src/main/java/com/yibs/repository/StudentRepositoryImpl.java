package com.yibs.repository;

import com.yibs.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liwh
 * @title: StudentRepositoryImpl
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/8/27 17:00
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository{
    private static Map<Long,Student> studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"张三2",23));
        studentMap.put(3L,new Student(3L,"张三3",24));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public Student deleteById(long id) {
        return studentMap.remove(id);
    }
}
