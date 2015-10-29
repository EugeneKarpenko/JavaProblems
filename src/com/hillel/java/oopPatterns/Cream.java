package com.hillel.java.oopPatterns;

/**
 * Created by Eugene Karpenko on 04.06.2015.
 */
public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 15;
    }

    @Override
    public String description() {
        return beverage.description() + ", cream";
    }
}
