package com.beans.learner.lab.demo;

import java.util.ArrayList;
import java.util.List;

public class Students extends People<Student> {
    public Students() {
        super(new ArrayList<>());
    }

    public Students(List<Student> students) {
        super(students);
    }

}
