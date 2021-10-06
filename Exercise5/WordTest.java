package Exercise5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WordTest {

    Word word1 = new Word("test");

    @Test
    public void testEquals() {
        boolean result = word1.equals(new Word("Test"));
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testCompareTo() {
        int result1 = word1.compareTo(new Word("Test"));
        int result2 = word1.compareTo(new Word("test"));
        int result3 = word1.compareTo(new Word("tst"));

        Assertions.assertEquals(1, result1);
        Assertions.assertEquals(1, result2);
        Assertions.assertEquals(0, result3);
    }
}
