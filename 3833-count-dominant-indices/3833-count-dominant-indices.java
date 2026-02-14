class Solution {
    public int dominantIndices(int[] nums) {
        int c=0;
        int sum=0;

        for(int x:nums){
            sum+=x;
        }
        for(int i=0;i<nums.length;i++){
         sum-=nums[i];
         int n=nums.length-i-1;
        if(n>0){
        double avg=1.0*sum/n;  
         if(nums[i]>avg)c++;
        }
        }
        return c;
    }
}