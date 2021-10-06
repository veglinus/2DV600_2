package Exercise2and3;
import two_dv600.AbstractIntCollection;
import two_dv600.IntStack;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

    public void push(int n) {
        /* Add integer at top of stack. */

        for (int i = 0; i < size() + 1; i++) {
            //System.out.println(i + " out of " + this.size + " v: " + this.values[i]);
            if (this.values[i] == 0) {
                //System.out.println(this.values[i] + " = empty space found, adding");
                this.values[size()] = n;
                break;
            }
            // TODO: Make array bigger by calling resize()
        }
        this.size++;

    }

    public int pop() throws IndexOutOfBoundsException {
        /* Returns and removes integer at top of stack  */
        try {
            for (int i = size() - 1; i >= 0; i--) { // Iterate backwards
                if (this.values[i] != 0) { // First occurance of value
                    int oldvalue = this.values[i];
                    this.values[i] = 0; // Set to 0
                    this.size--;
                    return oldvalue;
                }
            }

            return 0;

        } catch (Exception e) {
            throw new IndexOutOfBoundsException("No values were found in stack.");
        }
    }

    public int peek() throws IndexOutOfBoundsException {
        for (int i = size() - 1; i >= 0; i--) { // Iterate backwards
            if (this.values[i] != 0) { // First occurance of value
                return this.values[i];
            }
        }

        return 0;
    }
	
	/* Number of integers currently stored. */
	public int size() {
        return super.size();
    };
	
	/* Returns true if collection is empty. */
	public boolean isEmpty() {
        if (super.size() > 0) {
            return false;
        } else {
            return true;
        }
    };
	
	/* String of type "[ 7 56 -45 68 ... ]" */
	public String toString() {
        return super.toString();
    };
    
}