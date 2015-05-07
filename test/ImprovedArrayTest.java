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

        ImprovedArray improvedArray2 = new ImprovedArray();
        improvedArray2.add("4");
        improvedArray2.add("42");
        improvedArray2.add("1");
        improvedArray2.add("465");
        improvedArray2.add("38");
        improvedArray2.add("328");
        improvedArray2.add("82");
        improvedArray2.add("51");
        improvedArray2.add("118");
        improvedArray2.add("108");
        improvedArray2.add("19");
        improvedArray2.add("518");

        System.out.println(improvedArray.toString());

        //Assert.assertEquals(null, improvedArray.get(55));
        Assert.assertEquals(12, improvedArray.size());
        Assert.assertTrue("arrays equal", improvedArray2.equals(improvedArray));

        for (Object num:improvedArray) {
            System.out.println(num);
        }
    }
}
