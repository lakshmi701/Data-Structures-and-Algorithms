class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        int MAX = Integer.MAX_VALUE;

        for (int i = 0; i <= amount; i++) {
            dp[i] = MAX;
        }

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != MAX) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] == MAX ? -1 : dp[amount];
    }
}
