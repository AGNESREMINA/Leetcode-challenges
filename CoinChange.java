class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = 0;
        for (int j = 1; j <= amount; j++) dp[0][j] = Integer.MAX_VALUE - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        int result = dp[n][amount];
        return result >= Integer.MAX_VALUE - 1 ? -1 : result;
    }
}
