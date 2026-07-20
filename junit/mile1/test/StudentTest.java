package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;

public class StudentTest {

    StudentReport report = new StudentReport();

    // TC1: Check grade A
    @Test
    public void testGradeA() throws Exception {

        Student student =
                new Student("Saranya", new int[] {95, 90, 92});

        assertEquals("A", report.findGrades(student));
    }

    // TC2: Check grade D
    @Test
    public void testGradeD() throws Exception {

        Student student =
                new Student("Ravi", new int[] {65, 60, 62});

        assertEquals("D", report.findGrades(student));
    }

    // TC3: Check grade F
    @Test
    public void testGradeF() throws Exception {

        Student student =
                new Student("Anu", new int[] {40, 45, 35});

        assertEquals("F", report.findGrades(student));
    }

    // TC4: Student object is null
    @Test(expected = NullStudentException.class)
    public void testNullStudent()
            throws NullStudentException,
            NullNameException,
            NullMarksArrayException {

        report.validate(null);
    }

    // TC5: Student name is null
    @Test(expected = NullNameException.class)
    public void testNullName()
            throws NullStudentException,
            NullNameException,
            NullMarksArrayException {

        Student student =
                new Student(null, new int[] {80, 85, 90});

        report.validate(student);
    }

    // TC6: Marks array is null
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarks()
            throws NullStudentException,
            NullNameException,
            NullMarksArrayException {

        Student student = new Student("Kiran", null);

        report.validate(student);
    }

    // TC7: Count students having null names
    @Test
    public void testFindNumberOfNullName() {

        Student[] students = {
                new Student("Ravi", new int[] {70, 80}),
                new Student(null, new int[] {60, 70}),
                new Student("Anu", new int[] {90, 95}),
                new Student(null, new int[] {50, 55})
        };

        assertEquals(2, report.findNumberOfNullName(students));
    }

    // TC8: Count null student objects
    @Test
    public void testFindNumberOfNullObjects() {

        Student[] students = {
                new Student("Ravi", new int[] {70, 80}),
                null,
                new Student("Anu", new int[] {90, 95}),
                null
        };

        assertEquals(2, report.findNumberOfNullObjects(students));
    }

    // TC9: Count students having null marks arrays
    @Test
    public void testFindNumberOfNullMarks() {

        Student[] students = {
                new Student("Ravi", new int[] {70, 80}),
                new Student("Kiran", null),
                new Student("Anu", new int[] {90, 95}),
                new Student("Divya", null)
        };

        assertEquals(2, report.findNumberOfNullMarks(students));
    }
}