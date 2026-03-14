class Solution {
    public int coinChange(int[] a, int t) {
      int n=a.length;
      if(t==0)return 0;
      int dp[][]=new int[a.length][t+1];
      for(int i=0;i<a.length;i++){
       Arrays.fill(dp[i],Integer.MAX_VALUE);
      }
      for(int r=0;r<n;r++){
        dp[r][0]=0;
      }
    for(int j=0;j<=t;j++){
        if(j % a[n-1] == 0){
                dp[n-1][j] = j / a[n-1];
            }
        }
      for(int i=n-2;i>=0;i--){
        for(int j=0;j<=t;j++){
            //not take
            int nt=dp[i+1][j];
            //take;
            int ta=Integer.MAX_VALUE;
            if(j-a[i]>=0 &&dp[i][j-a[i]]!=Integer.MAX_VALUE){
            ta=1+dp[i][j-a[i]];
            }
            dp[i][j]=Math.min(ta,nt);
        }
      }
      if(dp[0][t]>=Integer.MAX_VALUE)return -1;
      return dp[0][t];
    }
}