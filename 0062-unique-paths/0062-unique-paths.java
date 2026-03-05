class Solution {
    
   
    public int func(int r,int c,int m,int n,int dp[][]){
        if(r==m-1||c==c-1)
        {
          return 1;
        }
        if(r<0||r>=m||c<0||c>=n)return 0;

if(dp[r][c]!=-1)return dp[r][c];
        int m1=0,m2=0;
      
         m1=func(r+1,c,m,n,dp);
         m2=func(r,c+1,m,n,dp);
        
       return dp[r][c]=m1+m2;
        
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(0,0,m,n,dp);

       
    }
}