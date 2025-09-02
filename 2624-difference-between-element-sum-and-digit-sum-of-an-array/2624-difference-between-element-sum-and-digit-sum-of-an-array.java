class Solution {
    public int differenceOfSum(int[] nums) {
        int a=0,s=0,rem=0;
        for(int i=0;i<nums.length;i++){
           a+=nums[i];
           while(nums[i]>0){
            s+=nums[i]%10;
            nums[i]/=10;
           }
        }
        if(a>s)return a-s;
        return s-a;
    }
}