package com.company;


import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Math.class.getName());

    public static void main(String[] args) {
        logger.info(String.valueOf(getSum1(1,2,3,4,5)));
        logger.info(String.valueOf(getSum2(12345)));

        int result = getMaxPalindrome(1331, 2442);
        logger.info("Max palindrome is " + result);

    }

    public static int getSum1(Integer ... number){
        int result = 0;
        for (Integer a : number) {
            result += a;
        }
        return result;
    }



    public static int getSum2(int number){
        String str = String.valueOf(number);
        int result = 0;
        char[] charArray = str.toCharArray();
        for (char a : charArray){
            result += Character.getNumericValue(a);
        }
        return result;
    }



    private static int getMaxPalindrome(int number, int number2) {
        for (int a = number; a > number/10; a--) {
            for (int b = number2; b > number2/10; b--) {
                int result = a * b;
                if (isPalindrome(result)) {
                    return result;
                }
            }
        }
        return -1;
    }
    private static boolean isPalindrome(int result) {
        final String str = String.valueOf(result);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) return false;
        }
        return true;
    }
}