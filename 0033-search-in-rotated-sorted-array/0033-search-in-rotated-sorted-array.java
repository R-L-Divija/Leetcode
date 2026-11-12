class Solution {
    public int search(int[] nums, int tar) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
           if(nums[m]==tar)return m;
            if(nums[l]<=nums[m]){
                if(nums[l]<=tar && tar<nums[m]){
                    r=m-1;
                }else l=m+1;
            }
            else {
                if(nums[m]<tar && tar <=nums[r])l=m+1;
                else r=m-1;
            }
            
        }
        return -1;
    }
}