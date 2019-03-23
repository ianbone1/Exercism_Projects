class Darts {

    Double radius;

    Darts(double x, double y) {
        radius = Math.sqrt(Math.pow(Math.abs(x),2) + Math.pow(Math.abs(y),2));
    }

    int score() {
        if (radius>10){
            return 0;
        } else if (radius >5) {
            return 1;
        } else if (radius >1) {
            return 5;
        } else {
            return 10;
        }
    }

}
