class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        // (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9 * 2 + x10 * 1) mod 11 == 0
        stringToVerify = stringToVerify.replace("-","");
        if (stringToVerify.length() != 10){ return false;}
        int checkSum = 0;
        for (int i=0; i < stringToVerify.length(); i++){
            if ((stringToVerify.charAt(i) == 'X') && (i == 9)){
                checkSum += 10;
            } else if( Character.isDigit(stringToVerify.charAt(i))) {
                checkSum += Character.getNumericValue(stringToVerify.charAt(i)) * (10-i);
            } else {
                return false;
            }
        }
        return checkSum % 11 == 0;
    }
}
