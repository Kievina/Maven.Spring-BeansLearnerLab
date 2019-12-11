package com.beans.learner.lab.demo;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {
    public Instructor () {}
    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List<Learner> learnerList = new ArrayList<>();
        for (Learner learner : learners)
            learnerList.add(learner);

        double numberOfHoursPerLearner = numberOfHours / learnerList.size();
        for (Learner learner : learnerList) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}