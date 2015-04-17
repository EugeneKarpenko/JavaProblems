import org.junit.Test;

/**
 * Created by EKarpenko on 17.04.2015.
 */
public class ImprovedArrayTest {
    public void main(String[] args) {
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

    @Test
    public void asd() {
        System.out.println("asd test running");
    }
}
