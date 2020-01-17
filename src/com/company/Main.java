package com.company;


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
        String str = String.valueOf(number);
        int result = 0;
        int remainder = 10;
        int division = 1;
        for (int i = 0; i < str.length(); i++){
            result += (number % remainder / division);
            remainder *= 10;
            division *= 10;
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



    public static int getMaxPalindrome(){
        int finish = 0;
        for (int i = 9999; i > 999; i--){
            for (int x = 9999; x > 999; x--){
                String result = String.valueOf(i * x);
                StringBuilder reverse = new StringBuilder(result).reverse();
                if (result.equals(reverse.toString())){
                    finish = Integer.parseInt(result);
                    break;
                }
            }
            if (!(finish == 0)){
                break;
            }
        }
        return finish;
    }
}