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
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void currentStudents() {
        Student expected1 = students.findById(1L);
        Student expected2 = students.findById(2L);
        Student expected3 = students.findById(3L);

        Assert.assertTrue(students.contains(expected1));
        Assert.assertTrue(students.contains(expected2));
        Assert.assertFalse(students.contains(expected3));
    }

    @Test
    public void previousStudents() {
        Student expected1 = previousStudents.findById(1L);
        Student expected2 = previousStudents.findById(3L);
        Student expected3 = previousStudents.findById(4L);
        Student expected4 = previousStudents.findById(5L);

        Assert.assertFalse(previousStudents.contains(expected1));
        Assert.assertTrue(previousStudents.contains(expected2));
        Assert.assertTrue(previousStudents.contains(expected3));
        Assert.assertTrue(previousStudents.contains(expected4));
    }
}