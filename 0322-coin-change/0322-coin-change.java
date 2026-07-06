class Solution {
    public int solve(int i, int s, int a[], int tar, int dp[][]) {
        if (s == tar) return 0;
        if (i == a.length) return Integer.MAX_VALUE;

        if (dp[i][s] != -1) return dp[i][s];

        int t = Integer.MAX_VALUE;

        if (s  <= tar- a[i]) {
            int res = solve(i, s + a[i], a, tar, dp);

            if (res != Integer.MAX_VALUE)
                t = 1 + res;
        }

        int nt = solve(i + 1, s, a, tar, dp);

        return dp[i][s] = Math.min(t, nt);
    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;

        int dp[][] = new int[coins.length][amount + 1];

        for (int i = 0; i < coins.length; i++)
            Arrays.fill(dp[i], -1);

        int ans = solve(0, 0, coins, amount, dp);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}