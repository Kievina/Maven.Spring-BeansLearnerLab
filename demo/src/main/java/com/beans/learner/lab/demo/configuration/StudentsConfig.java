package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.Student;
import com.beans.learner.lab.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentsConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        Student student1 = new Student(1L, "April");
        Student student2 = new Student(2L, "Bryan");
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);

        return new Students(allStudents);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        Student studentC = new Student(3L, "Carly");
        Student studentD = new Student(4L, "David");
        Student studentE = new Student(5L, "Eddie");

        List<Student> prevStudents = new ArrayList<>();
        prevStudents.add(studentC);
        prevStudents.add(studentD);
        prevStudents.add(studentE);

        return new Students(prevStudents);
    }

}
