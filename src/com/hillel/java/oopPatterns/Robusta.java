package com.hillel.java.oopPatterns;

/**
 * Created by Eugene Karpenko on 04.06.2015.
 */
public class Robusta extends Beverage {
    @Override
    public int cost() {
        return 90;
    }

    @Override
    public String description() {
        return "Robusta";
    }
}
