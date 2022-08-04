package com.company.dependencyinjection;

public class Student {
    private int id;
    private String studentName;
    public void displayStudentInfo(){
        System.out.println("Student name: "+studentName);
        System.out.println("Student ID: "+id);
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
