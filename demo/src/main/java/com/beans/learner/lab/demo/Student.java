package com.beans.learner.lab.demo;

public class Student extends Person implements Learner {
    private double totalStudyTime;
    public Student() {}
    public Student(Long id, String name) {
        super(id, name);
        this.totalStudyTime = 0.0;
    }

    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}

