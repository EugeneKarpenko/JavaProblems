package com.hillel.java.oopPatterns;

/**
 * Created by Eugene Karpenko on 04.06.2015.
 */
public class HouseBlend extends Beverage {
    @Override
    public int cost() {
        return 95;
    }

    @Override
    public String description() {
        return "House blend";
    }
}
