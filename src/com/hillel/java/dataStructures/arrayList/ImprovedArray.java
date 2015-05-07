package com.hillel.java.dataStructures.arrayList;

import com.hillel.java.dataStructures.ArrayIterator;
import com.hillel.java.dataStructures.IDataStructure;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by EKarpenko on 15.04.2015.
 */
public class ImprovedArray implements IDataStructure, Iterable {
    private Object[] array = new Object[10];
    private int arrayCounter = 0;

    public void add(Object value) {
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

    public Object removeByIndex(int index) {
        if (index >= arrayCounter) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + arrayCounter);
        }

        if (index == arrayCounter - 1) {
            return array[--arrayCounter];
        }

        Object removedValue = array[index];
        for (int i = index; i < size(); i++)
        {
            array[i] = array[i + 1];
        }

        arrayCounter--;
        return removedValue;
    }

    public Object get(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size());
        }

        return array[index];
    }

    public int size() {
        return arrayCounter;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ImprovedArray)) {
            return false;
        }

        ImprovedArray otherArray = (ImprovedArray) other;

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
            string += get(i) != null ? get(i).toString() : " ";
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

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }
}
