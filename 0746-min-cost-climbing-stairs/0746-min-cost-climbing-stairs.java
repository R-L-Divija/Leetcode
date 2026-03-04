class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        if (n == 1)return cost[0];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            int m1 = cost[i] + dp[i - 1];
            int m2 = cost[i] + dp[i - 2];
            dp[i] = Math.min(m1, m2);
        }
        return Math.min(dp[n - 1],dp[n-2]);
    }
}