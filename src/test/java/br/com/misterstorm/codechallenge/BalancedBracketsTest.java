package br.com.misterstorm.codechallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BalancedBracketsTest {

    @Test
    void ensureThatReturnsFalseWhenExpressionIsNotBalanced() {
        var notBalancedExpression = "{[(])}";

        var sut = new BalancedBrackets();

        assertFalse(sut.isBalanced(notBalancedExpression));
    }

    @Test
    void ensureThatReturnsTrueWhenExpressionIsBalanced() {
        var balancedExpression = "{{[[(())]]}}";

        var sut = new BalancedBrackets();

        assertTrue(sut.isBalanced(balancedExpression));
    }
    @Test
    void ensureThatReturnsTrueWhenExpressionIsEmpty() {
        var balancedExpression = "";

        var sut = new BalancedBrackets();

        assertTrue(sut.isBalanced(balancedExpression));
    }

}