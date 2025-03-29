package br.com.misterstorm.codechallenge;

import java.util.*;

/*
* Given an unsorted array of integers,
* return the indices of two elements that,
* when added together, result in the provided target value.
* You may assume that each input has exactly one solution,
* and you may not use the same array element more than once.
* If no two elements satisfy the condition, return [-1, -1].
* */
public class ArraySumChecker {

    public int[] check(int[] array, int number) {
        Map<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (complement.containsKey(array[i])) {
                return new int[]{complement.get(array[i]), i };
            }
            complement.put(number - array[i], i);
        }
        return new int[]{-1, -1};
    }
}
