class Solution {
    public int maxProduct(int[] nums) {
        int c=1;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            c=c*x;
            max=Math.max(max,c);
            if(x==0)c=1;
        }
        c=1;
        for(int i=nums.length-1;i>=0;i--){
            c*=nums[i];
            max=Math.max(max,c);
            if(nums[i]==0)c=1;
        }
        return max;
    }
}