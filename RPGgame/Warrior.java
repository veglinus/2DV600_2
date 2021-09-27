package RPGgame;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Character {

    List<String> knownAbilities = new ArrayList<>();
    String allowedproficiency1 = "athletics";
    String allowedproficiency2 = "survival";

    Warrior(String name) {
        this.name = name;
        this.className = "Warrior";
    }

    Warrior(String name, int level) {
        this.name = name;
        this.className = "Warrior";
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