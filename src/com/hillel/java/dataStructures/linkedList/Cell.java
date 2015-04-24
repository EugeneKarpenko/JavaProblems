package com.hillel.java.dataStructures.linkedList;

/**
 * Created by EKarpenko on 17.04.2015.
 */
public class Cell {
    private Object value;
    private Cell next;

    public Cell(Object value) {
        this.value = value;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getNext() {
        return next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Object getValue() {
        return value;
    }
}
