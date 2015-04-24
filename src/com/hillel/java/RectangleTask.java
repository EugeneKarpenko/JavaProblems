package com.hillel.java;

/**
 * Created by Eugene Karpenko on 15.04.2015.
 */
public class RectangleTask {

//    public static final double AREA = 6;
//    public static final double PERIMETER = 10;

    private double _area;
    private double _perimeter;
    private double _d;
    private Rectangle _rectangle;

    public static void main(String[] args) {
        RectangleTask task1 = new RectangleTask(6, 9);

        if (task1.hasSolution()) {
            System.out.println(task1.getRectangle().toString());
        }
        else {
            System.out.println("Error: invalid rectangle parameters in task1");
        }

        RectangleTask task2 = new RectangleTask(6, 10);

        if (task2.hasSolution()) {
            System.out.println(task2.getRectangle().toString());
        }
        else {
            System.out.println("Error: invalid rectangle parameters in task2");
        }

    }

    public RectangleTask(double area, double perimeter) {
        _area = area;
        _perimeter = perimeter;
        _rectangle = null;

        calculateDiscriminant();
    }

    public boolean hasSolution() {
        return _d >= 0;
    }

    public Rectangle getRectangle() {
        if (!hasSolution()) {
            return null;
        }

        if (_rectangle != null) {
            return _rectangle;
        }

        double width = (_perimeter + Math.sqrt(_d)) / 4;
        double height = (_perimeter - Math.sqrt(_d)) / 4;

        return _rectangle = new Rectangle(width, height);
    }

    private void calculateDiscriminant() {
        _d = Math.pow(_perimeter, 2) - 16 * _area;
    }
}
