import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class DnDCharacter {

    private int generatePoints(){
        ArrayList<Integer> rolls=new ArrayList<>();
        Random rand = new Random();
        rolls.add(rand.nextInt(6)+1);
        rolls.add(rand.nextInt(6)+1);
        rolls.add(rand.nextInt(6)+1);
        rolls.add(rand.nextInt(6)+1);
        Collections.sort(rolls);
        rolls.remove(0);
        Integer tally=0;
        for (Integer roll : rolls){
            tally+=roll;
        }
        return tally;
    }

    private int ability = generatePoints();
    private int strength = generatePoints();
    private int dexterity = generatePoints();
    private int constitution = generatePoints();
    private int intelligence = generatePoints();
    private int wisdom = generatePoints();
    private int charisma = generatePoints();

    public int ability() {
        return ability;
    }

    public int modifier(int input) {
        return (int) Math.floor(((input - 10.0) / 2.0));
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return 10+modifier(constitution);
    }
}
