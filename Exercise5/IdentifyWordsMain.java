package Exercise5;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class IdentifyWordsMain {
    
    public static void main(String[] args) throws Exception {
        
        try {
            File words = new File("Exercise5/HistoryOfProgramming.txt");
            Scanner myScanner = new Scanner(words);

            File newfile = new File("Exercise5/words.txt");
            newfile.createNewFile();
            FileWriter write = new FileWriter("Exercise5/words.txt");

            while (myScanner.hasNextLine()) {

                // TODO: More exception handling?
                String input = myScanner.nextLine();
                String output = input.replaceAll("[^\\w\\s]+", "");

                System.out.println(output);
                write.write(output);
                write.write(String.format("%n")); 
            }

            write.close();
            myScanner.close();
        } catch (Exception e) {
            throw e;
        }
    }
}
