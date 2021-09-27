package Exercise2;
import two_dv600.AbstractIntCollection;
import two_dv600.IntList;

public class ArrayIntList extends AbstractIntCollection implements IntList {

    @Override
    public void add(int n) {
        //System.out.println("Adding " + n + " Size is: " + this.size);
        for (int i = 0; i < size() + 1; i++) {
            //System.out.println(i + " out of " + this.size + " v: " + this.values[i]);
            if (this.values[i] == 0) {
                //System.out.println(this.values[i] + " = empty space found, adding");
                this.values[size()] = n;
                break;
            }
            // TODO: Make array bigger and add at end if above 8
        }
        this.size++;
    }

    public void addAt(int n, int index) throws IndexOutOfBoundsException {
    /* Inserts integer n at position index. Shifts the element currently at that 
	 * position (if any) and any subsequent elements to the right.  */
        int[] oldarray = this.values.clone();
        boolean addedN = false;

        for (int i = 0; i < this.size; i++) {

            if (addedN == false) {
                if (i == index) { // If we're at desired index, add new value
                    //System.out.println("Adding " + n + " at index " + i + " Size is: " + this.size);
                    this.values[i] = n;
                    addedN = true;
                    this.size++; // We added a value, increase size
                }
            } else {
                this.values[i] = oldarray[i - 1]; // 1 step back in original array
            }
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException { // TODO

        boolean removeN = false;
        int[] oldarray = this.values.clone();

        for (int i = 0; i < oldarray.length; i++) {
            if (removeN == false) {
                if (i == index) {
                    removeN = true;
                    this.size--;
                }
            } else {
                this.values[i - 1] = oldarray[i];
            }
        }
    }

    public int get(int index) throws IndexOutOfBoundsException {
        return this.values[index];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.values.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(int n) {
        /* Find position of integer n, otherwise return -1 */
        for (int i = 0; i < values.length; i++) {
            if (values[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return this.values.toString();
    }
    
}
