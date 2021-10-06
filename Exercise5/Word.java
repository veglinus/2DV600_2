package Exercise5;

public class Word implements Comparable<Word> {
    private String word;
   
    public Word(String str) { 
        this.word = str.toLowerCase();
    }

    @Override
    public String toString() { return word; }
    
    @Override
    public int hashCode() {
        String wordLower = word.toLowerCase();
        char[] chars = wordLower.toCharArray();
        int hash = 0;

        for (int i = 0; i < chars.length; i++) {
            var x = Character.getNumericValue(chars[i]);
            x = x * 31;
            hash += x;
        }

        return hash;
    }

    @Override
    public boolean equals(Object other) {
    // true if two words are equal"

        int word1 = this.word.hashCode();
        int word2 = other.toString().hashCode();

        if (word1 == word2) {
            return true;
        } else {
            return false;
        }
    }

    /* Implement Comparable */
    public int compareTo(Word w) {
        //"compares two words lexicographically"
        return this.word.compareTo(w.toString());
    }
} 
