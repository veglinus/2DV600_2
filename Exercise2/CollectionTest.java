package Exercise2;

import org.junit.jupiter.api.Assertions;
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

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            test.addAt(5, 10);
        });
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

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            test.remove(9);
        });
    }

    @Test
    public void testGet() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        Assertions.assertEquals(1, test.get(0));

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            test.get(10);
        });
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

    @Test
    public void testToString() {
        test.add(1);
        test.add(2);
        test.add(3);
        Assertions.assertEquals("[ 1 2 3 ]", test.toString());
        test.remove(2);
        test.remove(0);
        test.remove(0);
        Assertions.assertEquals("[ ]", test.toString());
    }


    ArrayIntStack test2 = new ArrayIntStack();

    @Test
    public void testPush() {
        test2.push(1);
        test2.push(2);
        test2.push(3);
        Assertions.assertEquals("[ 1 2 3 ]", test2.toString());
    }

    @Test
    public void testPop() {
        test2.push(1);
        test2.push(2);
        test2.push(3);
        test2.pop();
        Assertions.assertEquals("[ 1 2 ]", test2.toString());
    }

    @Test
    public void testPeek() {
        test2.push(1);
        test2.push(2);
        test2.push(3);
        Assertions.assertEquals(3, test2.peek());
        test2.pop();
        Assertions.assertEquals(2, test2.peek());
    }

    @Test
    public void testStackSize() {
        test2.push(1);
        test2.push(2);
        test2.push(3);
        test2.push(4);
        test2.push(5);
        Assertions.assertEquals(5, test2.size());
        test2.pop();
        Assertions.assertEquals(4, test2.size());
        Assertions.assertEquals("[ 1 2 3 4 ]", test2.toString());
        test2.push(5);
        test2.push(6);
        Assertions.assertEquals(6, test2.size());
    }

    @Test
    public void testStackIsEmpty() {
        Assertions.assertEquals(true, test2.isEmpty());
        test2.push(1);
        Assertions.assertEquals(false, test2.isEmpty());
        test2.pop();
        Assertions.assertEquals(true, test2.isEmpty());
    }

    @Test
    public void testStackToString() {
        test2.push(1);
        test2.push(2);
        test2.push(3);
        Assertions.assertEquals("[ 1 2 3 ]", test2.toString());
        test2.pop();
        test2.pop();
        test2.pop();
        Assertions.assertEquals("[ ]", test2.toString());
    }
}
