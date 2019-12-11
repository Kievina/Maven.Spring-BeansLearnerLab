package com.beans.learner.lab.demo.configuration;
import com.beans.learner.lab.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        return new Students();
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return new Students();
    }
}
