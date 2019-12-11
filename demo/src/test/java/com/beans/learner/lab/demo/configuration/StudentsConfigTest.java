package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.Student;
import com.beans.learner.lab.demo.Students;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentsConfigTest {
    @Autowired
    @Qualifier("students")
    private Students students;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Before
    public void setUp() throws Exception {
        students = new Students();
        previousStudents = new Students();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void currentStudents() {
        Assert.assertEquals(0,students.size());
        Student student = new Student();
        students.add(student);
        Assert.assertEquals(1, students.size());
    }

    @Test
    public void previousStudents() {
        Assert.assertTrue(previousStudents.size()==0);
        Assert.assertFalse(previousStudents.size()==1);
    }
}