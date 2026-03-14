class Solution {
    public int func(int i,int s,int[] arr,int t){
        if(i==arr.length){
            if(s==t)return 1;
            return 0;
        }
        int ta=func(i+1,s+arr[i],arr,t);
        int nt=func(i+1,s-arr[i],arr,t);
        return ta+nt;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return func(0,0,nums,target);
    }
}