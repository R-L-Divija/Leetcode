class Solution {
    public boolean func(int i,int j,int nums[],int t){
       
        int c=0;
        for(int k=i;k<=j;k++){
           if(nums[k]==t)c++;
        }
        int len=j-i+1;
        return 2*c>len;

    }
    public int countMajoritySubarrays(int[] nums, int t) {
        int res=0;
        for(int i=0;i<nums.length;i++){
             int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==t)c++;
                 int len=j-i+1;
        if( 2*c>len)res++;
            }
        }
        return res;
    }
}