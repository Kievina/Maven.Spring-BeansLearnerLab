package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.Instructor;
import com.beans.learner.lab.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class InstructorsConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        Instructor instructor = new Instructor(1L, "Chris");
        List<Instructor> tcUsa = new ArrayList<>();
        tcUsa.add(instructor);
        return new Instructors(tcUsa);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        Instructor instructor1 = new Instructor(2L, "Froilan");
        Instructor instructor2 = new Instructor(3L, "Roberto");
        List<Instructor> tcUk = new ArrayList<>();
        tcUk.add(instructor1);
        tcUk.add(instructor2);
        return new Instructors(tcUk);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors() {

        ArrayList<Instructor> allInstructors = new ArrayList<>();
        allInstructors.addAll(tcUsaInstructors().findAll());
        allInstructors.addAll(tcUkInstructors().findAll());
        return new Instructors(allInstructors);
    }
}
