/**
 * Character
 */
public class Character {
    String name;
    String className;
    int level = 1;
    Attributes attributes = new Attributes(0, 0, 0, 0);

    public String getName() {
        return name;
    }
    public String getClassName() {
        return className;
    }
    public int getLevel() {
        return level;
    }
    public int getPrimaryAttribute() {
        if (this.className == "Warrior") {
            return this.attributes.strength;
        } else if (this.className == "Rogue") {
            return this.attributes.agility;
        } else if (this.className == "Mage") {
            return this.attributes.intelligence;
        } else if (this.className == "Cleric") {
            return this.attributes.wisdom;
        } else {
            throw new IllegalArgumentException("No class set!");
        }
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}