class Solution {
    public int func(String s1,String s2,int i,int j,int dp[][]){
        if(j==s2.length())return 1;
        if(i==s1.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int r=0;
        if(s1.charAt(i)==s2.charAt(j)){
            int t=func(s1,s2,i+1,j+1,dp);
            int nt=func(s1,s2,i+1,j,dp);
            r=t+nt;
        }else r=func(s1,s2,i+1,j,dp);
        return dp[i][j]=r;
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return func(s,t,0,0,dp);
    }
}