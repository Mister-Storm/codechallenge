package br.com.misterstorm.codechallenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public boolean isBalanced(String expression) {

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            addElementsOnStackIfIsAnOpenBracket(c, stack);
            if ((c == ')' || c == ']' || c == '}') && stack.isEmpty()) {
                return false;
            }
            popElementsOnStackIfIsCloseBracket(c, stack);
        }
        return stack.isEmpty();
    }

    private static void popElementsOnStackIfIsCloseBracket(char c, Deque<Character> stack) {
        if (stack.isEmpty()) return;
        if (c == ')' && stack.peek() == '(') {
            stack.pop();
        }
        if (c == ']' && stack.peek() == '[') {
            stack.pop();
        }
        if (c == '}' && stack.peek() == '{') {
            stack.pop();
        }
    }

    private static void addElementsOnStackIfIsAnOpenBracket(char c, Deque<Character> stack) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        }
    }
}
