public class Testing {
    public static void main(String[] args) {
        var mychar = new Warrior("Linus");

        var myspell = new Ability("Brutal smash", "survival");

        mychar.learnAbility(myspell);

        System.out.println(mychar.knownAbilities.toString());
    }
}


/*

    Character(String name, String className) {
        this.name = name;

        className = className.toLowerCase();
        if (className == "mage" || className == "warrior" || className == "rogue" || className == "cleric") {
            this.className = className;
        } else {
            throw new IllegalArgumentException("Allowed classes are mage, warrior, rogue or cleric.");
        }
        
        this.level = 1;
        this.primaryAttribute = getPrimaryAttribute();
    }


            switch (this.className.toLowerCase()) {
            case "mage":
                return "intelligence";
            
            case "warrior":
                return "strength";
            
            case "rogue":
                return "agility";

            case "cleric":
                return "wisdom";
        
            default:
                throw new IllegalArgumentException("Character does not have a class.");
        }
*/