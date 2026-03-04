class Solution {
    // int cs(int index,int n,int dp[]){
    //     if(index==n)return 1;//base case
    //     if(index>n)return 0;//pruning case
    //     if(dp[index]!=0)return dp[index];//cache check
    //     return dp[index]=cs(index+1,n,dp)+cs(index+2,n,dp);//transitions store and return 
    // }
    public int climbStairs(int n) {
    // int dp[]=new int[n+1]; //store number of ways to reach n from i
    // return cs(0,n,dp);
    int dp[]=new int[n+1];
    dp[0]=1;
    dp[1]=2;
    for(int i=2;i<n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n-1];
    }
}