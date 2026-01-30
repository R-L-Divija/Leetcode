class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int l=0;
        int ans=Integer.MAX_VALUE;
        int s=0;
        for(int r=0;r<nums.length;r++){
            s+=nums[r];
            while(s>=k){
                ans=Math.min(ans,r-l+1);
                s-=nums[l];
                l++;
            }
        }
        return (ans==Integer.MAX_VALUE)?0:ans;
    }
}