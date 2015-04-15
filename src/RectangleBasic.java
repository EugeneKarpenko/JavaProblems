/**
 * Created by Eugene Karpenko on 15.04.2015.
 */
public class RectangleBasic {

    public static final double AREA = 6;
    public static final double PERIMETER = 10;

    public static void main(String[] args) {
        double d = Math.pow(PERIMETER, 2) - 16 * AREA;

        if (d < 0) {
            System.out.println("Error: invalid rectangle parameters");
            return;
        }

        double width = (PERIMETER + Math.sqrt(d)) / 4;
        double height = (PERIMETER - Math.sqrt(d)) / 4;

        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle height: " + height);
    }
}
