class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int l=0;
       int ans=0;
       int p=1;
       
       for(int r=0;r<nums.length;r++){
       p*=nums[r];
       while(l<=r && p>=k){
        p/=nums[l];
        l++;
       }
       ans+=1+(r-l);
       } 
       return ans;
    }
}