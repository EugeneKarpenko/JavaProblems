package com.hillel.java.oopPatterns;

/**
 * Created by Eugene Karpenko on 04.06.2015.
 */
public class Arabica extends Beverage {

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Arabica";
    }
}
