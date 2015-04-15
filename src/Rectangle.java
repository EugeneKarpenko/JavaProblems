/**
 * Created by Eugene Karpenko on 15.04.2015.
 */
public class Rectangle {

    public double width;
    public double height;

    private static final double epsilon = 0.0001;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle other = (Rectangle) obj;
        return Math.abs(width - other.width) < epsilon && Math.abs(height - other.height) < epsilon;
    }

    public String toString()
    {
        return "Width: " + width + ", Height: " + height;
    }
}
