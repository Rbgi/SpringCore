package com.config;

import com.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.entity")
@PropertySource("classpath:info.properties")
public class Config
{
    @Bean
    public Student studentBean()
    {
        Student student = new Student();
        return student;
    }
}
