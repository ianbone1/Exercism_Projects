import java.util.*;

class Yacht {

    int score;

//    YachtCategory    Score                   Example
//    Ones            1 × number of ones      1 1 1 4 5 scores 3
//    Twos            2 × number of twos      2 2 3 4 5 scores 4
//    Threes          3 × number of threes    3 3 3 3 3 scores 15
//    Fours           4 × number of fours     1 2 3 3 5 scores 0
//    Fives           5 × number of fives     5 1 5 2 5 scores 15
//    Sixes           6 × number of sixes     2 3 4 5 6 scores 6
//    Full House      Total of the dice       3 3 3 5 5 scores 19
//    Four of a Kind  Total of the four dice  4 4 4 4 6 scores 16
//    Little Straight 30 points               1 2 3 4 5 scores 30
//    Big Straight    30 points               2 3 4 5 6 scores 30
//    Choice          Sum of the dice         2 3 3 4 6 scores 18
//    Yacht           50 points               4 4 4 4 4 scores 50

    Yacht(int[] dice, YachtCategory yachtCategory) {
        score = 0;
        List<int[]> list = Arrays.asList(dice);
        ArrayList<Integer> diceList = new ArrayList<>();
        for (int die: dice){
            diceList.add(die);
        }
        Set<Integer> setList = new HashSet<>(diceList);
        Iterator<Integer> setIterator = setList.iterator();
        switch (yachtCategory){
            case YACHT:
                if ((dice[0]==dice[1]) && (dice[1]==dice[2]) &&
                    (dice[2]==dice[3]) && (dice[3]==dice[4])){
                    score = 50;
                }
                break;
            case ONES: case TWOS: case THREES: case FOURS: case FIVES: case SIXES:
                int ordinal = yachtCategory.ordinal();
                diceList.removeIf(n -> (n != ordinal));
                score = diceList.size() * ordinal;
                break;
            case FULL_HOUSE:
                if (setList.size()==2){
                    ArrayList<Integer> tempList = new ArrayList<>();
                    for (Integer d : diceList) tempList.add(d);
                    Integer setElementZero=setIterator.next();
                    tempList.removeIf(n-> n==setElementZero);
                    if ((tempList.size()==2) || (tempList.size()==3)) {
                        for (Integer d : diceList) {
                            score += d;
                        }
                    }
                }
                break;
            case FOUR_OF_A_KIND:
                if (setList.size()==2){
                    Integer setElementZero=setIterator.next();
                    Integer setElementOne=setIterator.next();
                    ArrayList<Integer> tempList = diceList;
                    tempList.removeIf(n-> n==setElementZero);
                    if (tempList.size()==1){
                        score = setElementZero * 4;
                    } else if (tempList.size() == 4){
                        score = setElementOne * 4;
                    } else {
                        score = 0;
                    }
                } else if (setList.size() == 1){
                    Integer setElementZero=setIterator.next();
                    score = setElementZero * 4;
                }
                break;
            case LITTLE_STRAIGHT:
                Integer lastDice=0;
                Collections.sort(diceList);
                boolean littleStraight = true;
                for (Integer currentDice : diceList){
                    if ((currentDice == 1) && (lastDice != 1)) {
                        lastDice=currentDice;
                    } else if (currentDice == lastDice + 1){
                        lastDice=currentDice;
                    } else {
                        littleStraight = false;
                    }
                }
                if (littleStraight){
                    score = 30;
                }
                break;
            case BIG_STRAIGHT:
                Integer theDice=0;
                Collections.sort(diceList);
                boolean bigStraight = true;
                boolean firstRun = true;
                for (Integer currentDice : diceList){
                    if (currentDice == 1){
                        bigStraight=false;
                        break;
                    } else if (firstRun) {
                        theDice = currentDice;
                        firstRun = false;
                    } else if (currentDice == theDice + 1){
                        theDice=currentDice;
                    } else {
                        bigStraight = false;
                    }
                }
                if (bigStraight){
                    score = 30;
                }
                break;
            case CHOICE:
                if ((setList.size() > 2) || (setList.size()==1)){
                    for (int d : diceList){
                        score += d;
                    }
                }
                break;
            default:
                score=0;
        }

    }

    int score() {
        return score;
    }

}
