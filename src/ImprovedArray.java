import java.util.Arrays;

/**
 * Created by EKarpenko on 15.04.2015.
 */
public class ImprovedArray {
    private String[] array = new String[10];
    private int arrayCounter = 0;

    public static void main(String[] args) {
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add("4");
        improvedArray.add("42");
        improvedArray.add("1");
        improvedArray.add("465");
        improvedArray.add("38");
        improvedArray.add("328");
        improvedArray.add("82");
        improvedArray.add("51");
        improvedArray.add("118");
        improvedArray.add("108");
        improvedArray.add("19");
        improvedArray.add("518");

        String[] array2 = {"4", "42", "1", "465", "38", "328", "82", "51", "118", "108", "19", "518",
                null, null, null, null, null, null, null, null};

        System.out.println(improvedArray.toString());
        System.out.println(improvedArray.get(55));
        System.out.println(improvedArray.size());
        System.out.println(improvedArray.equals(array2));
    }

    public void add(String value) {
        if (arrayCounter >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        array[arrayCounter++] = value;
    }

    public String get(int index) {
        return index < arrayCounter ? array[index] : null;
    }

    public int size() {
        return arrayCounter;
    }

    public boolean equals(Object other) {
        String[] otherArray = (String[]) other;

        if (array.length != otherArray.length) {
            return false;
        }

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == null && otherArray[i] == null) {
                continue;
            }

            if (array[i] == null || otherArray[i] == null || !array[i].equals(otherArray[i])) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String string = "[";
        for (int i = 0; i < array.length; i++)
        {
            string += array[i] != null ? array[i] : " ";
            string += (i < array.length - 1 ? ", " : "");
        }
        string += "]";
        return string;
    }
}
