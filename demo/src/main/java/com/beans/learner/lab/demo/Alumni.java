package com.beans.learner.lab.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {
    private Students previousStudents;
    private Instructors instructors;

    @Autowired
    public Alumni(Students previousStudents, Instructors instructors) {
        this.previousStudents = previousStudents;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootCamp() {
        for(Instructor instructor: instructors)
            instructor.lecture(previousStudents, 1200);
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
