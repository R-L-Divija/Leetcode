class Solution {
    public int solve(int i,int sum,int c[],int tar,int dp[][]){
        if(sum==tar)return 0;
        if(i==c.length)return Integer.MAX_VALUE;
        int t=Integer.MAX_VALUE;
       if(dp[i][sum]!=-1)return dp[i][sum];
        if(sum<=tar-c[i]){
            int res=solve(i,sum+c[i],c,tar,dp);
            if(res!=Integer.MAX_VALUE){
                t=1+res;
            }
        }
        int nt=solve(i+1,sum,c,tar,dp);
        return dp[i][sum]=Math.min(t,nt);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0)return 0;
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(0,0,coins,amount,dp);
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}