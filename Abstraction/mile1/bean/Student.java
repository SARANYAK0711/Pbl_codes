package com.mile1.bean;

public class Student {

    private String name;
    private int[] marks;
    private String grade;

    // Default Constructor
    public Student() {

    }

    // Parameterized Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Parameterized Constructor
    public Student(String name, int[] marks, String grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Marks
    public int[] getMarks() {
        return marks;
    }

    // Setter for Marks
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Getter for Grade
    public String getGrade() {
        return grade;
    }

    // Setter for Grade
    public void setGrade(String grade) {
        this.grade = grade;
    }
}