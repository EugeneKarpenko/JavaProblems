package com.hillel.java.dataStructures.linkedList;

import com.hillel.java.dataStructures.IDataStructure;

/**
 * Created by EKarpenko on 17.04.2015.
 */
public class LinkedCells implements IDataStructure {
    private Cell head;
    private int counter;
    private Cell tail;

    public LinkedCells(Object... values) {
        for (Object value: values) {
            add(value);
        }
    }

    public void add(Object value) {
        Cell cell = new Cell(value);

        if (head == null) {
            head = cell;
        }
        else {
            tail.setNext(cell);
        }

        tail = cell;
        counter++;
    }

    public void addByIndex(int index, String value) {
        if (index == counter) {
            add(value);
            return;
        }

        Cell newCell = new Cell(value);
        if (index == 0) {
            newCell.setNext(head);
            head = newCell;
            counter++;
            return;
        }

        /* More code - less calculations */
        Cell preIndexCell = getCellByIndex(index - 1);
        Cell indexCell = preIndexCell.getNext();

        preIndexCell.setNext(newCell);
        newCell.setNext(indexCell);

        /* Less code but more calculations - calling getCellByIndex twice */
        //newCell.setNext(getCellByIndex(index));
        //getCellByIndex(index - 1).setNext(newCell);

        counter++;
    }

    public Object get(int index) {
        return getCellByIndex(index).getValue();
    }

    public Object removeByIndex(int index) {
        if (index >= counter){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + counter);
        }

        Object removed;
        if (index == 0) {
            removed = head;
            head = head.getNext();
            counter--;
            return removed;
        }

        Cell preIndexCell = getCellByIndex(index - 1);
        removed = preIndexCell.getNext();
        if (index == counter - 1) {
            preIndexCell.setNext(null);
            tail = preIndexCell;
        }
        else {
            Cell postIndexCell = preIndexCell.getNext().getNext();
            preIndexCell.setNext(postIndexCell);
        }

        counter--;
        return removed;
    }

    public int size() {
        return counter;
    }

    public String toString() {
        String string = "[";
        Cell current = head;
        while (current.hasNext())
        {
            string += current.getValue() + ", ";
            current = current.getNext();
        }

        string += current.getValue() + "]";
        return string;
    }

    private Cell getCellByIndex(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + counter);
        }

        Cell cell = head;
        for (int i = 0; i < index; i++)
        {
            cell = cell.getNext();
        }

        return cell;
    }
}
