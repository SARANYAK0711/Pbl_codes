package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP39EF1111";
    }

    public String getOwnerName() {
        return "Sravya";
    }

    public int speed() {
        return 100;
    }

    public int gps() {
        System.out.println("GPS facility available.");
        return 1;
    }
}