class SumOfMultiples {

    private int total = 0;
    private boolean added = false;
    SumOfMultiples(int number, int[] set) {
        for (int i = 1; i < number; i++){
            added = false;
            for (int divider : set){
                if ((divider != 0) && (!added) && (i % divider == 0)){
                    total += i;
                    added=true;
                }
            }
        }
    }

    int getSum() {
        return total;
    }

}
