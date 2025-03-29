package br.com.misterstorm.codechallenge;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumCoinsTest {

    @Test
    void ensureThatChangeIsCorrect() {
        int[] coins = {1, 2, 5};

        var sut = new MinimumCoins();

        assertEquals(3, sut.minimumCoins(coins, 11));
    }

    @Test
    void ensureThatReturnsOneNegativeWhenNoCoinsPossible() {
        int[] coins = {2};

        var sut = new MinimumCoins();

        assertEquals(-1, sut.minimumCoins(coins, 3));
    }

    @Test
    void ensureThatReturnsOneNegativeWhenNoCoins() {
        int[] coins = {};

        var sut = new MinimumCoins();

        assertEquals(-1, sut.minimumCoins(coins, 5));
    }

    @Test
    void ensureThatReturnsZeroWhenValueIsZero() {
        int[] coins = {1, 2, 3};

        var sut = new MinimumCoins();

        assertEquals(0, sut.minimumCoins(coins, 0));
    }

}