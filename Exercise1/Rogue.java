package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Rogue extends Character {

    List<String> knownAbilities = new ArrayList<>();
    String allowedproficiency1 = "acrobatics";
    String allowedproficiency2 = "stealth";

    Rogue(String name) {
        this.name = name;
        this.className = "Rogue";
    }

    Rogue(String name, int level) {
        this.name = name;
        this.className = "Rogue";
        this.level = level;
    }

    void learnAbility(Ability ability) {
        String abilityLowercase = ability.proficiency.toLowerCase();

        if (abilityLowercase == allowedproficiency1 || abilityLowercase == allowedproficiency2) {
            knownAbilities.add(ability.name);
            System.out.println(this.name + " learned " + ability.name + ".");
        } else {
            throw new IllegalArgumentException(this.className + " cannot learn abilities of proficiency " + ability.proficiency + ".");
        }
    }

    public List<String> getKnownAbilities() {
        return knownAbilities;
    }
}