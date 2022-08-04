package com.company.dependencyinjection;

public class Student {
    private String id;
    private String studentName;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student name: "+studentName);
        System.out.println("Student ID: "+id);
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setId(String id) {
        this.id = id;
    }
}
