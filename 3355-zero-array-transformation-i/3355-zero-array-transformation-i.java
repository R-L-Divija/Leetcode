class Solution {
    public boolean isZeroArray(int[] nums, int[][] q) {
        int max=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int d[]=new int[n];
        for(int x[]:q){
            int l=x[0];
            int r=x[1];
            
            d[l]+=1;
            if(r+1<n){
                d[r+1]-=1;
            }
        }
        int sum=0;
      for(int i=0;i<nums.length;i++){
        
sum+=d[i];
nums[i]-=sum;
        
      }
      for(int x:nums){
        if(x>0)return false;
      }
      return true;
    }
}