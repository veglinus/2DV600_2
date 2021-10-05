package Exercise4;
import java.util.Iterator;

class Test<E> implements Queue<E> {

    E[] queue;
    E[] newqueue;

    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public int size() {
        // TODO Auto-generated method stub
        

        return 0;
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if (this.iterator().hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public void enqueue(E element) {
        
        /*
        for (int i = 0; i < queue.length; i++) {
            newqueue[i] = queue[i];
        }
        */

        queue[queue.length + 1] = element;
        this.queue = newqueue;
        // TODO Auto-generated method stub
        
    }

    public E dequeue() {
        // TODO Auto-generated method stub
        return null;
    }

    public E first() {
        // TODO Auto-generated method stub
        return null;
    }

    public E last() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
    private class Node {
        E data;

        Node(E data) {
            this.data = data;
        }
    }*/

}