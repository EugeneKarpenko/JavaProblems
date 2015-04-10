import java.util.Arrays;

/**
 * Created by Eugene Karpenko on 10.04.2015.
 */
public class Sort {

    private static final int ARRAY_LEN = 10;

    public static void main (String[] args) {
        double[] array = createRandomArray(ARRAY_LEN);

        System.out.println("Unsorted: " + Arrays.toString(array));

        sort(array);

        System.out.println("Sorted: " + Arrays.toString(array));
    }

    public static void sort(double[] array) {
        int minItemIndex;
        for (int i = 0; i < ARRAY_LEN; i++) {
            minItemIndex = getIndexOfMinElement(array, i);
            swapElements(array, i, minItemIndex);
        }
    }

    public static double[] createRandomArray(int arraySize) {
        double[] array = new double[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * Double.MAX_VALUE;
        }

        return array;
    }

    public static int getIndexOfMinElement(double[] array, int startFrom) {
        int min = startFrom;
        for (int i = startFrom + 1; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }

        return min;
    }

    public static void swapElements(double[] array, int aIndex, int bIndex) {
        double temp = array[aIndex];
        array[aIndex] = array[bIndex];
        array[bIndex] = temp;
    }
}
