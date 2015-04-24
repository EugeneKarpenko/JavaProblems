import com.hillel.java.dataStructures.arrayList.StringArray;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Eugene Karpenko on 23.04.2015.
 */
public class StringArrayTest {
    @Test
    public void removeTest() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("B");
        array.add("C");

        String removedElement = array.remove(1);

        Assert.assertEquals("B", removedElement); // удалён правильный элемент
        Assert.assertEquals(2, array.size());     // размер должен измениться
        Assert.assertEquals("A", array.get(0));   // индекс предыдущих элементов не изменился
        Assert.assertEquals("C", array.get(1));   // индекс следующих элементов сместился
    }

    @Test
    public void addByIndexTest() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("C");
        array.add("D");

        array.addByIndex(1, "B");

        Assert.assertEquals(4, array.size());     // размер должен измениться
        Assert.assertEquals("A", array.get(0));   // индекс предыдущих элементов не изменился
        Assert.assertEquals("B", array.get(1));   // индекс следующих элементов сместился
        Assert.assertEquals("C", array.get(2));   // индекс следующих элементов сместился
        Assert.assertEquals("D", array.get(3));   // индекс следующих элементов сместился
    }
}
