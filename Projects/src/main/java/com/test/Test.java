package com.test;

import com.config.Config;
import com.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student stud = context.getBean("student", Student.class);
        System.out.println(stud);
    }
}
