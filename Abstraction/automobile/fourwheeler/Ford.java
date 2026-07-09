package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "AP39GH2222";
    }

    public String getOwnerName() {
        return "Sravya";
    }

    public int speed() {
        return 110;
    }

    public int tempControl() {
        System.out.println("Air conditioning facility available.");
        return 1;
    }
}