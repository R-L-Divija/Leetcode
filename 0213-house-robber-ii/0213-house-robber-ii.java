class Solution {
    public int func(int a[],int s,int e){
        int n=e-s+1;
        int dp[]=new int[n+1];
        dp[0]=a[s];
        if(n>1){
            dp[1]=Math.max(a[s],a[s+1]);
        }
        for(int i=2;i<n;i++){
            int m1=a[s+i]+dp[i-2];
            dp[i]=Math.max(m1,dp[i-1]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
       int n=nums.length;
       if(n==1)return nums[0];
       if(n==2)return Math.max(nums[0],nums[1]);
       int m1=func(nums,0,n-2);
       int m2=func(nums,1,n-1);
       return Math.max(m1,m2); 
    }
}