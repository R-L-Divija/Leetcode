class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r){
         int m=l+(r-l)/2;
         if(nums[m]<m){
            r=m-1;
         }
         else if(nums[m]>m){
           if(nums[m]==nums[m+1])return nums[m];
            l=m+1;
         }
         else {
            if(nums[m]==nums[m-1])return nums[m];
            else r=m-1;
         }
        }
        return -1;
    }
}