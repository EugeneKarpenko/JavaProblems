import com.hillel.java.dataStructures.linkedList.LinkedCells;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by EKarpenko on 17.04.2015.
 */
public class LinkedCellsTest {

    @Test
    public void toStringTest() {
        LinkedCells linkedCells = getLinkedList();

        System.out.println(linkedCells.toString());
    }

    @Test
    public void addTest() {
        LinkedCells linkedCells = new LinkedCells();
        linkedCells.add("A");
        linkedCells.add("B");
        linkedCells.add("C");

        Assert.assertEquals(3, linkedCells.size());
    }

    @Test
    public void getByIndex() {
        LinkedCells linkedCells = getLinkedList();

        Assert.assertEquals("B", linkedCells.get(1));
    }

    @Test
    public void addByIndex() {
        LinkedCells linkedCells = getLinkedList();
        linkedCells.addByIndex(3, "E");

        Assert.assertEquals("E", linkedCells.get(3));
        Assert.assertEquals(4, linkedCells.size());
    }

    @Test
    public void removeByIndex() {
        LinkedCells linkedCells = getLinkedList();
        linkedCells.removeByIndex(1);

        Assert.assertEquals("C", linkedCells.get(1));
        Assert.assertEquals(2, linkedCells.size());
    }

    private LinkedCells getLinkedList() {
       return new LinkedCells("A", "B", "C");
    }
}
