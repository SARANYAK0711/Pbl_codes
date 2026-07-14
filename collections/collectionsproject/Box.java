package com.wipro.collectionsproject;

public class Box {

    private double length;
    private double width;
    private double height;
    private double volume;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = length * width * height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Box b = (Box) obj;

        return length == b.length &&
               width == b.width &&
               height == b.height;
    }

    @Override
    public int hashCode() {

        return (int)(length * 31 + width * 17 + height * 13);
    }

    @Override
    public String toString() {

        return "Length : " + length +
               " Width : " + width +
               " Height : " + height +
               " Volume : " + volume;
    }
}