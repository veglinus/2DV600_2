/**
 * Ability
 */
package Exercise1;

public class Ability {
    String name;
    String proficiency;

    Ability(String name, String proficiency) {
        this.name = name;
        this.proficiency = proficiency;
    }

    public String getName() {
        return name;
    }
    public String getProficiency() {
        return proficiency;
    }
}