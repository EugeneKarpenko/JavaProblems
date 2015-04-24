package com.hillel.java.dataStructures.arrayList;

import java.util.Arrays;

/**
 * Created by EKarpenko on 15.04.2015.
 */
public class ImprovedArray {
    private String[] array = new String[10];
    private int arrayCounter = 0;

    public void add(String value) {
        if (arrayCounter >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        array[arrayCounter++] = value;
    }

    public String get(int index) {
        return index < arrayCounter ? array[index] : null;
    }

    public int size() {
        return arrayCounter;
    }

    public boolean equals(Object other) {
        String[] otherArray = (String[]) other;

        if (array.length != otherArray.length) {
            return false;
        }

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == null && otherArray[i] == null) {
                continue;
            }

            if (array[i] == null || otherArray[i] == null || !array[i].equals(otherArray[i])) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String string = "[";
        for (int i = 0; i < array.length; i++)
        {
            string += array[i] != null ? array[i] : " ";
            string += (i < array.length - 1 ? ", " : "");
        }
        string += "]";
        return string;
    }
}
