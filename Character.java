import java.util.ArrayList;
import java.util.List;

/**
 * Character
 */
public class Character {
    String name;
    String className;
    int level;
    String primaryAttribute;

    List<String> knownSpells = new ArrayList<>();

    public String getName() {
        return name;
    }
    public String getClassName() {
        return className;
    }
    public int getLevel() {
        return level;
    }
    public String getPrimaryAttribute() {
        return primaryAttribute;
    }
}