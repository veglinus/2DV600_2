package Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CollectionTest {

    /*
    @BeforeAll
    public void populateTestObject() {

    }*/
    
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
        test.remove(1);
        Assertions.assertEquals("[ 1 3 4 5 ]", test.toString());
    }

    @Test
    public void testGet() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        Assertions.assertEquals(1, test.get(0));
    }

    @Test
    public void testSize() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        Assertions.assertEquals(5, test.size());
        test.remove(4);
        Assertions.assertEquals(4, test.size());
        Assertions.assertEquals("[ 1 2 3 4 ]", test.toString());
        test.addAt(5, 4);
        Assertions.assertEquals("[ 1 2 3 4 5 ]", test.toString());
        test.add(6);
        test.addAt(3, 5);
        Assertions.assertEquals(7, test.size());
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertEquals(true, test.isEmpty());
        test.add(1);
        Assertions.assertEquals(false, test.isEmpty());
        test.remove(0);
        Assertions.assertEquals(true, test.isEmpty());
    }

    @Test
    public void testIndexOf() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        Assertions.assertEquals(0, test.indexOf(1));
        test.remove(4);
        Assertions.assertEquals(2, test.indexOf(3));
        Assertions.assertEquals(-1, test.indexOf(0));
    }

    
}
