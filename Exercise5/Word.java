package Exercise5;

public class Word implements Comparable<Word> {
    private String word;
   
    public Word(String str) { 
        this.word = str;
    }
    public String toString() { return word; }
    /* Override Object methods */


    public int hashCode() {

        
        
        //"compute a hash value for word"
        // TODO: What goes here?
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

    public int compareTo(Word w) { 
        //"compares two words lexicographically"

        // TODO: what?
        return this.word.compareTo(w.word);
    }
} 
