package com.hillel.java.dataStructures;

/**
 * Created by Eugene Karpenko on 24.04.2015.
 */
public interface IDataStructure {
    public void add(Object value);

    public Object get(int index);

    public int size();

    public void addByIndex(int index, String value);

    public Object removeByIndex(int index);
}
