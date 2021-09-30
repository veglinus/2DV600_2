package Exercise2;

import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals("[ 1 2 3 4 5 ]", test.toString());
    }

    @Test
    public void testAddAt() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.addAt(9, 2);
        Assertions.assertEquals("[ 1 2 9 3 4 5 ]", test.toString());
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
        Assertions.assertEquals("[ 1 3 4 5 6 7 ]", test.toString());
    }

    
}
