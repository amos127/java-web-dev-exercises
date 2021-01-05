package org.launchcode.java.demos.lsn4classes2;

public class School {

    public static void main(String[] args) {

        Student sally = new Student("Sally",1,1,4.0);
        Student amos = new Student("Amos", 2, 3, 3.5);
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.equals(amos));

    }
}
