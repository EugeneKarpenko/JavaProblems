package com.hillel.java.oopPatterns;

/**
 * Created by Eugene Karpenko on 04.06.2015.
 */
public abstract class BeverageDecorator extends Beverage {
    Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
