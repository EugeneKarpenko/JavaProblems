package com.hillel.java.serialization;

import java.io.Serializable;

/**
 * Created by EKarpenko on 04.06.2015.
 */
public class Car implements Serializable{

    private static long serialVersionUID = 1L;
    private String manufacturer;

    public Car(String lexus) {
        manufacturer = lexus;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return manufacturer;
    }
}
