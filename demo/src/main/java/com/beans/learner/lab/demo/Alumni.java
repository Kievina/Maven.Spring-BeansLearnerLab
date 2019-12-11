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
        int numberOfInstructors = instructors.size();
        int numberOfStudents = previousStudents.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        for(Instructor instructor: instructors)
            instructor.lecture(previousStudents, numberOfHoursPerInstructor);
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
