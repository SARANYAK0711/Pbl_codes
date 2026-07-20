package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentException,
            NullNameException,
            NullMarksArrayException {

        if (student == null) {
            throw new NullStudentException();
        }

        if (student.getName() == null) {
            throw new NullNameException();
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student student)
            throws NullStudentException,
            NullNameException,
            NullMarksArrayException {

        validate(student);

        int total = 0;

        for (int mark : student.getMarks()) {
            total = total + mark;
        }

        double average = (double) total / student.getMarks().length;

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public int findNumberOfNullName(Student[] students) {

        int count = 0;

        if (students == null) {
            return count;
        }

        for (Student student : students) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        if (students == null) {
            return count;
        }

        for (Student student : students) {
            if (student == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullMarks(Student[] students) {

        int count = 0;

        if (students == null) {
            return count;
        }

        for (Student student : students) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }

        return count;
    }
}