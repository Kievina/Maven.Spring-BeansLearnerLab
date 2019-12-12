package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.Classroom;
import com.beans.learner.lab.demo.Instructors;
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
public class ClassroomConfigTest {
    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;
    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;
    private Instructors instructorsTest;
    private Students studentsTest;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void currentCohort() {
        Assert.assertEquals("Chris", currentCohort.getInstructors().findById(1L).getName());
        Assert.assertEquals("April", currentCohort.getStudents().findById(1L).getName());
    }

    @Test
    public void previousCohort() {
        Assert.assertEquals("Chris", previousCohort.getInstructors().findById(1L).getName());
        Assert.assertEquals("David", previousCohort.getStudents().findById(4L).getName());
    }
}