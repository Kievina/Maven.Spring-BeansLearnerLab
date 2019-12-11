package com.beans.learner.lab.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AlumniTest {
   // @Autowired
    private Alumni alumni;

    List<Student> previousStudentList;
    List<Instructor> instructorList;
    Students students;
    Instructors instructors;

    @Before
    public void setUp() throws Exception {
      //Test 2 students, 3 instructors
        Student student1 = new Student();
        Student student2 = new Student();
        previousStudentList = new ArrayList<>();
        previousStudentList.add(student1);
        previousStudentList.add(student2);

        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor();
        Instructor instructor3 = new Instructor();
        instructorList = new ArrayList<>();
        instructorList.add(instructor1);
        instructorList.add(instructor2);
        instructorList.add(instructor3);

        students = new Students(previousStudentList);
        instructors = new Instructors(instructorList);

        alumni = new Alumni(students, instructors);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void executeBootCampTest() {
        //        2400/3 = 800 hours (each instructor)
        //        1200 hours (each student)
        alumni.executeBootCamp();
        Assert.assertEquals(1200, previousStudentList.get(0).getTotalStudyTime(), 0.0);

    }

    @Test
    public void getPreviousStudents() {
    }

    @Test
    public void setPreviousStudents() {
    }

    @Test
    public void getInstructors() {
    }

    @Test
    public void setInstructors() {
    }
}