package com.hillel.java.core;

import com.hillel.java.Rectangle;

/**
 * Created by Eugene Karpenko on 13.08.2015.
 */
public class Arguments {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println(rectangle);

        Arguments arguments = new Arguments();
        arguments.changeRectangle(rectangle, 5, 7);
        System.out.println(rectangle);
    }

    public void changeRectangle(Rectangle rectangle, int deltaX, int deltaY) {
        rectangle.width += deltaX;
        rectangle.height += deltaY;
        rectangle = null;
    }
}
