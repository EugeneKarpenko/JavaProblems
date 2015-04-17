import com.hillel.java.Cell;

/**
 * Created by EKarpenko on 17.04.2015.
 */
public class LinkedCells {
    private Cell head;
    private int counter;
    private Cell pointer;

    public void add(String value) {
        if (head == null) {
            head = new Cell(value);
            pointer = head;
        }
        else {
            pointer = new Cell(value);
        }

        head.setNext(pointer);
        counter++;
    }

    public String toString() {
        String string = "[";
        Cell current = head;
        while (current.hasNext())
        {
            string += current.getValue();
            string += (current.hasNext() ? ", " : "");
            current = current.getNext();
        }
        string += "]";
        return string;
    }
}
