package com.beans.learner.lab.demo.configuration;
import com.beans.learner.lab.demo.Classroom;
import com.beans.learner.lab.demo.Instructors;
import com.beans.learner.lab.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents) {
        return new Classroom(instructors, previousStudents);
    }
}