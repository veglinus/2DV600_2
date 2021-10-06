package Exercise5;

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashSet;

public class WordCount1Main {
    public static void main(String[] args) throws Exception {
        
        try {
            File words = new File("Exercise5/words.txt");
            Scanner myScanner = new Scanner(words);

            HashSet<Word> hashset = new HashSet<Word>();
            TreeSet<Word> treeSet = new TreeSet<Word>();

            while (myScanner.hasNextLine()) {
                String input = myScanner.nextLine();

                String[] wordArray = input.split(" ");

                for (int i = 0; i < wordArray.length; i++) {
                    Word word = new Word(wordArray[i]);
                    hashset.add(word);
                    treeSet.add(word);
                }

            }

            System.out.println("Hashset size: " + hashset.size());
            System.out.println("Treeset size: " + treeSet.size());
            System.out.println("Treeset: " + treeSet);


            myScanner.close();
        } catch (Exception e) {
            throw e;
        }
    }
}
