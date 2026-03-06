class Solution {
    public boolean canPartition(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0)return false;
        int tar=sum/2;
        boolean dp[][]=new boolean[arr.length][tar+1];
      
        //step 1 make col[0] =true;
        for(int r=0;r<n;r++){
            dp[r][0]=true;
        }
        //step 2 make last row => whose last sum present in array (true)
        
        
            if(arr[n-1]<=tar){
            dp[n-1][arr[n-1]]=true;
            
        }
        //fill remaining row(n-2) and col(1)

        for(int i=n-2;i>=0;i--){
            for(int j=1;j<=tar;j++){
                boolean s2=false;
                //not take
               boolean s1=dp[i+1][j];
                // take
                if(j-arr[i]>=0){
                    s2=dp[i+1][j-arr[i]];
                }
                dp[i][j]=s1||s2;
            }
        }

     return dp[0][tar];
    }
}