import two_dv600.AbstractIntCollection;
import two_dv600.IntList;

public class ArrayIntList extends AbstractIntCollection implements IntList {

    @Override
    public void add(int n) {
        System.out.println("Adding " + n + " Size is: " + this.size);
        
        for (int i = 0; i < this.size + 1; i++) {

            if (this.values[i] == 0) {
                //System.out.println(this.values[i] + " = empty space found, adding");
                this.values[this.size] = n;
                break;
            } else {
                //System.out.println(this.values[i] + " = not empty");
            }
            
        }
        this.size++;
    }

    public void addAt(int n, int index) throws IndexOutOfBoundsException {
    /* Inserts integer n at position index. Shifts the element currently at that 
	 * position (if any) and any subsequent elements to the right.  */

        

        
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
