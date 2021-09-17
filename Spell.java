/**
 * Spell
 */
public class Spell {
    String name;
    String school;
    
    Spell(String name, String school) {
        this.name = name;
        this.school = school;
    }
    
    public String getName() {
        return name;
    }
    public String getSchool() {
        return school;
    }
}