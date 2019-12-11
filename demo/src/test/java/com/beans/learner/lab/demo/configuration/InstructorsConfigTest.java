package com.beans.learner.lab.demo.configuration;

import com.beans.learner.lab.demo.Instructor;
import com.beans.learner.lab.demo.Instructors;
import com.beans.learner.lab.demo.Student;
import com.beans.learner.lab.demo.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;


    @Test
    public void tcUsaInstructors() {
        tcUsaInstructors = new Instructors();
        Assert.assertTrue(tcUsaInstructors.size()==0);
        Assert.assertFalse(tcUsaInstructors.size()==1);
    }

    @Test
    public void tcUkInstructors() {
        tcUkInstructors = new Instructors();
        Assert.assertEquals(0,tcUkInstructors.size());
        Instructor instructor = new Instructor();
        tcUkInstructors.add(instructor);
        Assert.assertEquals(1, tcUkInstructors.size());
    }

    @Test
    public void instructors() {
        instructors = new Instructors();
        instructors = new Instructors();
        Assert.assertEquals(0,instructors.size());
        Instructor instructor = new Instructor();
        instructors.add(instructor);
        Assert.assertEquals(1, instructors.size());
    }
}