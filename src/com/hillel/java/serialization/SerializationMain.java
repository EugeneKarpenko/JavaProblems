package com.hillel.java.serialization;

import java.io.*;

/**
 * Created by EKarpenko on 04.06.2015.
 */
public class SerializationMain {
    public static void main(String[] args) {
        Car car = new Car("Lexus");

        //save(car);

        car = load();

        System.out.println(car);
    }

    private static Car load() {
        Car car = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serializedCar.dat"))) {
            car = (Car) inputStream.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return car;
    }

    private static void save(Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("serializedCar.dat"))) {
            outputStream.writeObject(car);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
