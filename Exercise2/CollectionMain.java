package Exercise2;
public class CollectionMain {
    
    public static void main(String[] args) {
        
        System.out.println("Testing IntList:");
        ArrayIntList test = new ArrayIntList();

        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.addAt(9, 2);
        test.add(6);
        test.remove(1);
        test.add(7);

        System.out.println("Get at index 0: " + test.get(0));
        System.out.println("Size: " + test.size() + " | Is empty?: " + test.isEmpty());
        System.out.println("Digit at index 7: " + test.indexOf(7));
        System.out.println("Entire IntList to string: " + test.toString());
        

        System.out.println("\nTesting IntStack:");
        ArrayIntStack test2 = new ArrayIntStack();

        test2.push(1);
        test2.push(2);
        test2.push(3);
        test2.push(4);
        test2.push(5);

        System.out.println("Removing value at top of stack: " + test2.pop());

        System.out.println("Peeking at value at top of stack: " + test2.peek());
        System.out.println("Size of stack: " + test2.size() + " | isEmpty?: " + test2.isEmpty());
        
        System.out.println("Entire IntStack to string: " + test2.toString());

    }
}
