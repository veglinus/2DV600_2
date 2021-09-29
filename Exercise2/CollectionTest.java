package Exercise2;

import org.junit.jupiter.api.Test;

public class CollectionTest {
    
    ArrayIntList test = new ArrayIntList();

    @Test
    public void testAdd() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        System.out.println(test.toString());
    }

    @Test
    public void testAddAt() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.addAt(9, 2);

        System.out.println(test.toString());
    }

    @Test
    public void testRemove() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.remove(1);
        test.add(7);

        System.out.println(test.toString());
    }
}
