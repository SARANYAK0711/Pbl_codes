package com.mile1.exception;

public class NullNameException extends Exception {

    private static final long serialVersionUID = 1L;

    public NullNameException() {
        super("Student name is null");
    }
}