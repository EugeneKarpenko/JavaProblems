package com.hillel.java.oopPatterns;

/**
 * Created by Eugene Karpenko on 04.06.2015.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverage coffe = new Arabica();

        System.out.println(coffe.description());

        coffe = new Milk(coffe);

        System.out.println(coffe.description());

        coffe = new Cream(coffe);

        coffe = new Cream(coffe);

        System.out.println(coffe.description());

    }
}
