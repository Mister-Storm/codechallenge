package br.com.misterstorm.codechallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ArraySumCheckerTest {

    @Test
    void ensureThatReturnArrayWithNegativeNumbersWhenSumDoesNotMatch() {
        int[] arrayToCheck = { 2, 4, 6, 8, 10 };
        var sut  = new ArraySumChecker();
        var result = sut.check(arrayToCheck, 5);
        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }

    @Test
    void ensureThatReturnArrayWithCorrectNumbersWhenSumMatches() {
        int[] arrayToCheck = { 1, 4, 5, 7, 8, 16 };
        var sut  = new ArraySumChecker();
        var result = sut.check(arrayToCheck, 9);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

}