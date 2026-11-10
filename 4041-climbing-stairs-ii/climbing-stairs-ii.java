class Solution {
    public int f(int i, int[] costs, int n, int[] dp) {
        if (i == n)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = Integer.MAX_VALUE;

        if (i + 1 <= n)
            x = costs[i] + 1 + f(i + 1, costs, n, dp);
        if (i + 2 <= n)
            y = costs[i + 1] + 4 + f(i + 2, costs, n, dp);
        if (i + 3 <= n)
            z = costs[i + 2] + 9 + f(i + 3, costs, n, dp);

        int mini = Math.min(x, Math.min(y, z));
        return dp[i] = mini;
    }

    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        java.util.Arrays.fill(dp, -1);
        return f(0, costs, n, dp);
    }
}