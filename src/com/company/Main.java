package com.company;


import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Math.class.getName());

    public static void main(String[] args) {
        logger.info(String.valueOf(getSum1(12345)));
        logger.info(String.valueOf(getSum2(12345)));

        int result = getMaxPalindrome();
        logger.info(String.valueOf(result));

    }

    public static int getSum1(int number){
        return (number % 10) + (number % 100 / 10) + (number % 1000 / 100) + (number % 10000 / 1000) + (number % 100000 / 10000);
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



    public static int getMaxPalindrome() {
        int max;
        String strResult;
        int result = 0;
        char[] chars;
        char[] chars1;
        for ( int i = 1000; i < 10000; i++){
            for (int x = 1000; x < 10000; x++){
                max = i * x;
                String str = String.valueOf(max);
                StringBuilder stb = new StringBuilder(str).reverse();
                chars = str.toCharArray();
                chars1 = String.valueOf(stb).toCharArray();
                if ( Arrays.equals(chars, chars1)){
                    strResult = new String(chars, 0, chars.length);
                    result = Integer.parseInt(strResult);
                }
            }
        }
        return result;
    }
}