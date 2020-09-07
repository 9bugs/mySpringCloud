package com.yibs.controller;

import com.yibs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author liwh
 * @title: StudentHandler
 * @projectName mySpringCloud
 * @description: TODO
 * @date 2020/8/27 17:13
 */
@RestController
@RequestMapping("/consume")
public class ConsumeHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8081/student/findAll",Collection.class).getBody();
    };
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8081/student/findAll",Collection.class);
    };

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8081/student/findById/{id}",Student.class,id).getBody();
    };
    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8081/student/findById/{id}",Student.class,id);
    };

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.getForEntity("http://localhost:8081/student/save",Student.class,student).getBody();
    }
    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.getForObject("http://localhost:8081/student/save",Student.class,student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.getForEntity("http://localhost:8081/student/update",Student.class,student).getBody();
    }

    @PutMapping("/update2")
    public void update2(@RequestBody Student student){
        restTemplate.getForObject("http://localhost:8081/student/update",Student.class,student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.getForEntity("http://localhost:8081/student/deleteById/{id}",Student.class,id).getBody();
    };

    @DeleteMapping("/deleteById2/{id}")
    public void deleteById2(@PathVariable("id") long id){
        restTemplate.getForObject("http://localhost:8081/student/deleteById/{id}",Student.class,id);
    };
}
