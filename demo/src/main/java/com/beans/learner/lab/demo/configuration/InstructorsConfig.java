package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class InstructorsConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        return new Instructors();
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        return new Instructors();
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors() {
        return new Instructors();
    }
}
