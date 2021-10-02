package Exercise5;

public class Word implements Comparable<Word> {
    private String word;
   
    public Word(String str) { 
        this.word = str;
    }

    public String toString() { return word; }
    /* Override Object methods */
    
    public int hashCode() {
        return word.hashCode();
        // TODO: Implement own hash method
    }


    public boolean equals(Object other) {
    // true if two words are equal"

        String word1 = this.word.toLowerCase();
        String word2 = other.toString().toLowerCase();

        if (word1 == word2) {
            return true;
        } else {
            return false;
        }
    }

    /* Implement Comparable */
    public int compareTo(Word w) { // TODO: test
        //"compares two words lexicographically"

        // "we consider upper case and lower case as equal."
        char[] array1 = w.word.toLowerCase().toCharArray();
        char[] array2 = this.word.toLowerCase().toCharArray();
        int matches = 0;

        if (array1.length == array2.length) { // if words are of same length:

            for (int i = 0; i < array1.length; i++) { // Foreach letter, if match, add to match index
                if (array1[i] == array2[i]) {
                    matches++;
                }
            }

            if (matches == array1.length) { // if match index = length of word === lexicographically identical
                return 1;
            } else {
                return 0;
            }

        } else {
            return 0; // TODO: What should the return value be?
        }
    }
} 
