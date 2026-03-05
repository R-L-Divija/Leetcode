class Solution {

 //1)Memorization
 
//  =>base case
//  =>Pruning case
//  =>Cache check
//  =>transitions states
//  n->(n-1) &(n-2)
//  =>store ans return 


    int func(int n,int dp[]){
        //base
        if(n<=1)return n;
        //pruning case --

        //cache check
       if(dp[n]!=-1)return dp[n];
        //logic
        return dp[n]=func(n-1,dp)+func(n-2,dp);
    }
    public int fib(int n) {
     int dp[]=new int[n+1];
     Arrays.fill(dp,-1);
     return func(n,dp);
    }
}