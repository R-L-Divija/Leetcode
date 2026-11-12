class Solution {
    public void rev(int nums[],int l,int r){
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        //find first dec element from right
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
        //find greater element than i
        int j=nums.length-1;
        while(nums[j]<=nums[i])j--;

        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;

        }
        //revserse nxt element of i
        rev(nums,i+1,nums.length-1);
    }
}