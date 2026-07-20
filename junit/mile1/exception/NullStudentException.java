package com.mile1.exception;

public class NullStudentException extends Exception {

    private static final long serialVersionUID = 1L;

    public NullStudentException() {
        super("Student object is null");
    }
}