class Proverb {

    private String ditty = "";

    Proverb(String[] words) {
        for (int i=0; i < words.length; i++){
            if ((i+1) == words.length ){
                ditty = ditty + "And all for the want of a " + words[0] + ".";
            } else {
                ditty = ditty + "For want of a "+ words[i] + " the " + words[i+1] + " was lost.\n";
            }
        }
    }

    String recite() {
        return ditty;
    }

}
