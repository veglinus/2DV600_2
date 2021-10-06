package Exercise4;
import java.util.Iterator;

class Queue<E> implements QueueInterface<E> {

    Node<E> head = null;
    Node<E> tail = null;
    int size = 0;

    public Iterator<E> iterator() {
        return new ListIterator();
    }

    class ListIterator implements Iterator<E> {

        Node<E> node = head;

        @Override
        public boolean hasNext() {
            if (node != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public E next() {
            E returnvalue = node.getValue();
            node = node.next;

            return returnvalue;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void enqueue(E element) {

        Node<E> newnode = new Node<E>(element, null);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = tail.next;
        }
        size++;
    }

    public E dequeue() {
        var returnvalue = first();

        head = head.next;
        size--;

        return returnvalue;
    }

    public E first() {
        return head.value;
    }

    public E last() {
        return tail.value;
    }

    private class Node<E> {
        E value;
        Node<E> next = null;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        public E getValue() {
            return this.value;
        }
    }

}