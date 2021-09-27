import two_dv600.AbstractIntCollection;
import two_dv600.IntList;

public class ArrayIntList extends AbstractIntCollection implements IntList {

    @Override
    public void add(int n) {
        //System.out.println("Adding " + n + " Size is: " + this.size);
        
        for (int i = 0; i < size() + 1; i++) { // TODO
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

        /**
         * [ 1 2   3 4 5 ]
         * [ 1 2 9 3 4 5 ]
         */

        int[] newarray = new int[this.size + 1];
        int[] oldarray = this.values.clone();
        boolean addedN = false;

        for (int i = 0; i < this.size; i++) {

            if (addedN == false) {
                if (i == index) {
                    //System.out.println("Adding " + n + " at index " + i + " Size is: " + this.size);
                    this.values[i] = n;
                    addedN = true;
                    this.size++;
                } else {
                    this.values[i] = this.values[i];
                }
            } else {
                
                
                this.values[i] = oldarray[i - 1];
            }
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        
    }

    public int get(int index) throws IndexOutOfBoundsException {
        return this.values[index];
    }

    public int indexOf(int n) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
