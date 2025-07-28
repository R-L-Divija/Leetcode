class Solution {
    public int[] applyOperations(int[] nums) {
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                nums[i-1]*=2;
                nums[i]=0;
            }
            i++;
        }
        int[] result=new int[nums.length];
        int index=0;
        for(int num:nums){
            if(num!=0)
            result[index++]=num;
        }
          return result;
    }
  
}