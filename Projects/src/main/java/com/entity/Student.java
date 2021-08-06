package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student
{
    @Value("${student.id}")
    private  int id;
    @Value("${student.name}")
    private String name;
    @Value("${student.course}")
    private  String course;

    public Student() {
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", course = '" + course + '\'' +
                '}';
    }

}
