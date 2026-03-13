class Solution {
    // int func(int index,int n,int arr[],int dp[]){
        
    //     if(index>=n) return 0;

    //     if(dp[index]!=-1) return dp[index];

    //     int take = arr[index] + func(index+2,n,arr,dp);

    //     int nottake = func(index+1,n,arr,dp);

    //     return dp[index] = Math.max(take,nottake);
    // }

    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        // Arrays.fill(dp,-1);
        // return func(0,nums.length,nums,dp);
        if(nums.length==1)return nums[0];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);

        for(int i=2;i<nums.length;i++){
            int m1=nums[i]+dp[i-2];
            int m2=dp[i-1];
            dp[i]=Math.max(m1,m2);
        }
        return dp[nums.length-1];
    }
}