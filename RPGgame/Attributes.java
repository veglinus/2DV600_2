package RPGgame;

public class Attributes {
    int strength = 0;
    int agility = 0;
    int intelligence = 0;
    int wisdom = 0;

    Attributes(int strength, int agility, int intelligence, int wisdom) {
        this.strength += strength;
        this.agility += agility;
        this.intelligence += intelligence;
        this.wisdom += wisdom;
    }

    public int getStrength() {
        return strength;
    }
    public int getAgility() {
        return agility;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
}