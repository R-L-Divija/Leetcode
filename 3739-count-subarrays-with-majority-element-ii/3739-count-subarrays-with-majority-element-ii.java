class Solution {
    public long countMajoritySubarrays(int[] nums, int t) {
        int n=nums.length;
        int f[]=new int[2*n+1];
        
        int index=n;
        f[n]=1;
        long p=0;
        long r=0;

        for(int x:nums){
            if(x==t){
                p+=f[index];
                index++;
            }else{
                index--;
                p-=f[index];
            }
            f[index]++;
            r+=p;
        }
        return r;
    }
}