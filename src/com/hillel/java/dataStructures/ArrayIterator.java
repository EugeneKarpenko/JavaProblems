package com.hillel.java.dataStructures;

import com.hillel.java.dataStructures.arrayList.ImprovedArray;

import java.util.Iterator;

/**
 * Created by Eugene Karpenko on 25.04.2015.
 */
public class ArrayIterator implements Iterator {
    private int pointer;
    private IDataStructure dataStructure;

    public ArrayIterator(IDataStructure dataStructure) {
        this.dataStructure = dataStructure;
    }

    @Override
    public boolean hasNext() {
        return pointer < dataStructure.size();
    }

    @Override
    public Object next() {
        return dataStructure.get(pointer++);
    }
}
