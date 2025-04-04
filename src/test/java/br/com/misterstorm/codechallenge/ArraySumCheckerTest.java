package br.com.misterstorm.codechallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ArraySumCheckerTest {

    @Test
    void ensureThatReturnArrayWithNegativeNumbersWhenSumDoesNotMatch() {
        int[] arrayToCheck = { 2, 8, 6, 4, 10 };
        var sut  = new ArraySumChecker();
        var result = sut.check(arrayToCheck, 5);
        assertAll(
                () -> assertEquals(-1, result[0]),
                () -> assertEquals(-1, result[1])
        );
    }

    @Test
    void ensureThatReturnArrayWithCorrectNumbersWhenSumMatches() {
        int[] arrayToCheck = { 1, 4, 5, 9, 8, 16 };
        var sut  = new ArraySumChecker();
        var result = sut.check(arrayToCheck, 12);
        assertAll(
                () -> assertEquals(1, result[0], "error in the first element of the response array."),
                () -> assertEquals(4, result[1], "error in the second element of the response array.")
        );
    }

}