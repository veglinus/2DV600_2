public class CollectionMain {
    
    public static void main(String[] args) {

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
         

        System.out.println(test.toString());

    }
}
