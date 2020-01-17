package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void getSumFirst15() {
        int result = Main.getSum1(12345);
        assertEquals(15, result);
    }

    @Test
    void getSumSecond15() {
        int result = Main.getSum2(12345);
        assertEquals(15, result);
    }

    @Test
    void getMaxPalindrome99000099() {
        int result = Main.getMaxPalindrome();
        assertEquals(99000099, result);
    }
}