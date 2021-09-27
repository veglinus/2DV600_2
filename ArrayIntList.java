import two_dv600.AbstractIntCollection;
import two_dv600.IntList;

public class ArrayIntList extends AbstractIntCollection implements IntList {

    @Override
    public void add(int n) {
        System.out.println("Adding " + n + " Size is: " + this.size);
        
        for (int i = 0; i < this.size + 1; i++) { // TODO
            if (this.values[i] == 0) {
                //System.out.println(this.values[i] + " = empty space found, adding");
                this.values[this.size] = n;
                break;
            } else {
                // TODO: Make array bigger and add at end
                //System.out.println(this.values[i] + " = not empty");
            }
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
        boolean addedN = false;

        for (int i = 0; i < this.size; i++) {

            if (addedN == false) {
                if (i == index) {
                    System.out.println("Adding " + n + " at index " + i + " Size is: " + this.size);
                    newarray[i] = n;
                    addedN = true;
                    this.size++;
                } else {
                    newarray[i] = this.values[i];
                }
            } else {
                int j = i - 1;
                newarray[i] = this.values[j];
            }
        }

        this.values = newarray;

        /*
        if (addedN) {
            this.size; // Todo: TEST
        }*/
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
