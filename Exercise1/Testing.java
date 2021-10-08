package Exercise1;

public class Testing {
    public static void main(String[] args) {

        var mychar = new Warrior("Linus");
        var myspell = new Ability("test", "survival");
        mychar.learnAbility(myspell);

        mychar.setAttributes(new Attributes(10, 10, 10, 10));

        var mychar2 = new Mage("Benny");
        mychar2.learnSpell(new Spell("Frostbolt", "evocation"));
        mychar2.learnSpell(new Spell("Frostbolt", "evocation"));

        Character[] party = {mychar};

        Character[] party2 = {mychar2};

        var b = new Battle();

        //b.printStatistics(party);

        Character[] winner = b.resolve(party, party2);

        if (winner == null) {
            System.out.println("Tie!");
        } else {
            System.out.println(winner[0].name + " party won!");
        }

        var winner2 = b.singleCombat(mychar, mychar2);

        if (winner2 == null) {
            System.out.println("Tie!");
        } else {
            System.out.println(winner2.name + " won!");
        }
    }
}