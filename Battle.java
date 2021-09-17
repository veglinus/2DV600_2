import java.util.List;

public class Battle {

    public void printStatistics(Character party[]) {
        int averageLevel = 0;
       
        int totalSpells = 0;
        int totalAbilities = 0;

        int mageSpells = 0;
        int clericSpells = 0;
        int warriorAbilities = 0;
        int rogueAbilities = 0;
        
        for (int i = 0; i < party.length; i++) {
            var current = party[i];
            averageLevel += current.level;

            // Depending of class, we add to thier class abilities/spell and also to the total of totalSpells or totalAbilities
            if (current instanceof Warrior) {
                List<String> abilities = ((Warrior) current).getKnownAbilities();
                totalAbilities += abilities.size();
                warriorAbilities += abilities.size();
            } else if (current instanceof Rogue) {
                List<String> abilities = ((Rogue) current).getKnownAbilities();
                totalAbilities += abilities.size();
                rogueAbilities += abilities.size();
            } else if (current instanceof Mage) {
                List<String> spells = ((Mage) current).getKnownSpells();
                totalSpells += spells.size();
                mageSpells += spells.size();
            } else if (current instanceof Cleric) {
                List<String> spells = ((Cleric) current).getKnownSpells();
                totalSpells += spells.size();
                clericSpells += spells.size();
            }
        }

        averageLevel = averageLevel / party.length; // Average level of party

        System.out.println("Party statistics:");
        System.out.println("Average level of party: " + averageLevel);
        System.out.println("Total abilities: " + totalAbilities + " | Warrior abilities: " + warriorAbilities + " | Rogue abilities: " + rogueAbilities);
        System.out.println("Total spells: " + totalSpells + " | Mage spells: " + mageSpells + " | Cleric spells: " + clericSpells);
    }

    public int averageLevel(Character party[]) {
        int averageLevel = 0;
        for (int i = 0; i < party.length; i++) {
            averageLevel += party[i].level;
        }
        return averageLevel / party.length;
    }

    public int primaryAttributeSum(Character party[]) {
        int sum = 0;

        for (int i = 0; i < party.length; i++) { // Foreach party member
            sum += party[i].getPrimaryAttribute(); // Add their primary attribute value to sum
        }

        return sum;
    }

    public Character[] resolve(Character party1[], Character party2[]) {

        if (party1.length > party2.length || party1.length < party2.length) { // Only if one is bigger than the other
            if (party1.length > party2.length) {
                return party1;
            } else {
                return party2;
            }
        } else {
            int party1Level = averageLevel(party1);
            int party2Level = averageLevel(party2);

            if (party1Level != party2Level) { // If partylevels aren't the same;
                if (party1Level > party2Level) { // Return the one that's the highest
                    return party1;
                } else {
                    return party2;
                }
            } else { // Average party levels are the same

                // Find sum of primary attributes in party
                int party1Score= primaryAttributeSum(party1);
                int party2Score = primaryAttributeSum(party2);

                if (party1Score != party2Score) { // If it's not a tie
                    if (party1Score > party2Score) { // Return the highest
                        return party1;
                    } else {
                        return party2;
                    }
                } else { // Everything is equal. Tie
                    // TODO: Handle tie
                    return null;
                }
            }
        }
    }

    public Character singleCombat(Character player1, Character player2) { // TODO: Test

        if (player1.level != player2.level) { // If levels aren't the same
            if (player1.level > player2.level) { // Return the one that's the highest
                return player1;
            } else {
                return player2;
            }
        } else { // Levels are the same

            if (player1.getPrimaryAttribute() != player2.getPrimaryAttribute()) { // If it's not a tie
                if (player1.getPrimaryAttribute() > player2.getPrimaryAttribute()) { // Return the highest
                    return player1;
                } else {
                    return player2;
                }
            } else {
                // Compare amount of abilities and spells
                int player1Spells = 0;
                int player2Spells = 0;

                Character[] opponents = {player1, player2};
                for (int i = 0; i < opponents.length; i++) { // Loop through both
                    var current = opponents[i];
                    int tempvalue = 0; // Add the amt of abilities/spells

                    if (current instanceof Warrior) {
                        tempvalue += ((Warrior) current).getKnownAbilities().size();
                    } else if (current instanceof Rogue) {
                        tempvalue += ((Rogue) current).getKnownAbilities().size();
                    } else if (current instanceof Mage) {
                        tempvalue += ((Mage) current).getKnownSpells().size();
                    } else if (current instanceof Cleric) {
                        tempvalue += ((Cleric) current).getKnownSpells().size(); 
                    } else {
                        throw new IllegalArgumentException("No class set for player 1.");
                    }

                    if (i == 0) { // If first loop, first player, add to player1spells
                        player1Spells += tempvalue;
                    } else {
                        player2Spells += tempvalue;
                    } 
                }

                if (player1Spells != player2Spells) { // One is more than the ither
                    if (player1Spells > player2Spells) { // Player 1 has more
                        return player1;
                    } else { // Player 2 has more
                        return player2;
                    }
                } else { // Tie again
                    // TODO: Handle tie
                    return null;
                }
            }
        }
    }
    
}
