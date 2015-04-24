package com.hillel.java.dataStructures.arrayList;

import java.util.Arrays;

/**
 * Created by EKarpenko on 15.04.2015.
 */
public class StringArray {
    private String[] array = new String[1];
    private int arrayCounter = 0;

    public void add(String value) {
        resize();
        array[arrayCounter++] = value;
    }

    public void addByIndex(int index, String value) {
        if (index > arrayCounter) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + arrayCounter);
        }

        resize();

        for (int i = size(); i > index; i--)
        {
            array[i] = array[i - 1];
        }

        array[index] = value;
        arrayCounter++;
    }

    public String get(int index) {
        if (index >= arrayCounter) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + arrayCounter);
        }

        return array[index];
    }

    public String remove(int index) {
        if (index >= arrayCounter) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + arrayCounter);
        }

        if (index == arrayCounter - 1) {
            return array[--arrayCounter];
        }

        String removedValue = array[index];
        for (int i = index; i < size(); i++)
        {
            array[i] = array[i + 1];
        }

        arrayCounter--;
        return removedValue;
    }

    public int size() {
        return arrayCounter;
    }

    public boolean equals(Object other) {
        if (!(other instanceof StringArray)) {
            return false;
        }

        StringArray otherArray = (StringArray) other;

        if (size() != otherArray.size()) {
            return false;
        }

        for (int i = 0; i < size(); i++)
        {
            if (!get(i).equals(otherArray.get(i))) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String string = "[";
        for (int i = 0; i < size(); i++)
        {
            string += get(i) != null ? get(i) : " ";
            string += (i < size() - 1 ? ", " : "");
        }
        string += "]";
        return string;
    }

    private void resize() {
        if (arrayCounter >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

}
