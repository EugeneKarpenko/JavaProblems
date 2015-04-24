import com.hillel.java.dataStructures.arrayList.ImprovedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by EKarpenko on 17.04.2015.
 */
public class ImprovedArrayTest {

    @Test
    public void arrTest() {
        System.out.println("asd test running");

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

        Assert.assertEquals(null, improvedArray.get(55));
        Assert.assertEquals(12, improvedArray.size());
        Assert.assertTrue(improvedArray.equals(array2));
    }
}
