import java.util.ArrayList;
import java.util.List;

public class Cleric extends Character {

    List<String> knownSpells = new ArrayList<>();
    String allowedSchool1 = "restoration";
    String allowedSchool2 = "divination";

    Cleric(String name) {
        this.name = name;
        this.className = "Cleric";
    }

    Cleric(String name, int level) {
        this.name = name;
        this.className = "Cleric";
        this.level = level;
    }

    void learnSpell(Spell spell) {
        String spellLowercase = spell.school.toLowerCase();

        if (spellLowercase == allowedSchool1 || spellLowercase == allowedSchool2) {
            knownSpells.add(spell.name);
            System.out.println(this.name + " learned " + spell.name + ".");
        } else {
            throw new IllegalArgumentException(this.className + " cannot learn spells of school " + spell.school + ".");
        }
    }

    public List<String> getKnownSpells() {
        return knownSpells;
    }
}