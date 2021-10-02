package Exercise4;
import java.util.Iterator;

class Test<E> implements Queue<E> {

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

}