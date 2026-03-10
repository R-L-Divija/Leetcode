class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        int prev[]=new int[n+1];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     int t=nums[i];
        //     nums[i]=nums[n-1-i];
        //     nums[n-1-i]=t;
        // }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
        }
        int max=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(dp[i]>max){
                max=dp[i];
                index=i;
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(index!=-1){
         ans.add(nums[index]);
         index=prev[index];
        }
        return ans;
    }
}