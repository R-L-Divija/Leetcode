class Solution {
    public boolean func(int a[],int t,int m){
        int s=0;
      
        for(int x:a){
            s+=(x+m-1)/m;
          
        }
        return s<=t;
    }
    public int smallestDivisor(int[] nums, int t) {
        int l=1;
        int r=0;
        int a=0;
        for(int x:nums)r=Math.max(r,x);
        while(l<=r){
           int m=l+(r-l)/2;
           if(func(nums,t,m)){
            a=m;
            r=m-1;
           }else l=m+1;
        }
        return a;
    }
}