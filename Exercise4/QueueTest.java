package Exercise4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QueueTest<E> {

    Queue<Integer> queue = new Queue<Integer>();
    
    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        queue.enqueue(2);

        Assertions.assertEquals(1, queue.first());
        Assertions.assertEquals(2, queue.last());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();

        Assertions.assertEquals(2, queue.first());
        Assertions.assertEquals(3, queue.last());
    }

    @Test
    public void test1000() {
        for (int i = 0; i < 1000; i++) {
            queue.enqueue(i);
        }
        queue.dequeue();
        Assertions.assertEquals(999, queue.size());
    }

    @Test
    public void testEmpty() {
        Assertions.assertEquals(true, queue.isEmpty());

        queue.enqueue(0);
        Assertions.assertEquals(false, queue.isEmpty());

        queue.dequeue();
        Assertions.assertEquals(true, queue.isEmpty());
    }




}
