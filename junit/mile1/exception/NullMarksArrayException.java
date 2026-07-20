package com.mile1.exception;

public class NullMarksArrayException extends Exception {

    private static final long serialVersionUID = 1L;

    public NullMarksArrayException() {
        super("Marks array is null");
    }
}