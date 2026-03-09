class Solution {
    public int func(int i,int j,String s1, String s2,int dp[][]){
        if(s1.length()==i||s2.length()==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+func(i+1,j+1,s1,s2,dp);
        }else{
            int icheck=func(i,j+1,s1,s2,dp);
            int jcheck=func(i+1,j,s1,s2,dp);
            return dp[i][j]=Math.max(icheck,jcheck);
        }
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++){
         Arrays.fill(dp[i],-1);
        }
        
        return func(0,0,s1,s2,dp);
    }
}