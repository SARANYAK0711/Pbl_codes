package com.wipro.automobile.ship;

public class Compartment {

    private int height;
    private int width;
    private int breadth;

    // Default Constructor
    public Compartment() {

    }

    // Parameterized Constructor
    public Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getter for Height
    public int getHeight() {
        return height;
    }

    // Setter for Height
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter for Width
    public int getWidth() {
        return width;
    }

    // Setter for Width
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter for Breadth
    public int getBreadth() {
        return breadth;
    }

    // Setter for Breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Display Method
    public void display() {
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Breadth : " + breadth);
    }
}