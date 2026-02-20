class Solution {
    public int count(int nums[],int k){
        int l=0;
        int r=0;
        int odd=0;
        int c=0;
        while(r<nums.length){
          if(nums[r]%2==1)odd++;
          while(odd>k){
            if(nums[l]%2==1)odd--;
            l++;
          }
        c+=r-l+1;
        r++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
}