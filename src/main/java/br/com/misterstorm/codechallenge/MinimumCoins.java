package br.com.misterstorm.codechallenge;

import java.util.Arrays;

/*
* Given a value N and a set of coins C = {c₁, c₂, ..., cₖ},
* find the minimum number of coins required to make up the value N.
* */
public class MinimumCoins {

    public int minimumCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
