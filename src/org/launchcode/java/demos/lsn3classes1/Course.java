package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private int id;
    private String name;
    private ArrayList<Student> roster = new ArrayList<>();

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addStudent(Student student) {
        this.roster.add(student);
    }

    public ArrayList<Student> getRoster() {
        return this.roster;
    }
}
