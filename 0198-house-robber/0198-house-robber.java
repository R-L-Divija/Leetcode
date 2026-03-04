class Solution {
    int func(int index,int n,int arr[],int dp[]){
        
        if(index>=n) return 0;

        if(dp[index]!=-1) return dp[index];

        int take = arr[index] + func(index+2,n,arr,dp);

        int nottake = func(index+1,n,arr,dp);

        return dp[index] = Math.max(take,nottake);
    }

    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return func(0,nums.length,nums,dp);
    }
}