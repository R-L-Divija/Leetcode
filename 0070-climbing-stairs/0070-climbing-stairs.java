class Solution {
    int cs(int index,int n,int dp[]){
        if(index==n)return 1;
        if(index>n)return 0;
        if(dp[index]!=0)return dp[index];
        return dp[index]=cs(index+1,n,dp)+cs(index+2,n,dp);
    }
    public int climbStairs(int n) {
    int dp[]=new int[n+1];
    return cs(0,n,dp);
    }
}