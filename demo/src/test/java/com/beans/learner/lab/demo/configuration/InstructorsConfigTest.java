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
        Assert.assertEquals(1, tcUsaInstructors.size());
    }

    @Test
    public void tcUkInstructors() {
        Assert.assertEquals(2, tcUkInstructors.size());
    }

    @Test
    public void instructors() {
        Assert.assertEquals(3, instructors.size());

    }
}