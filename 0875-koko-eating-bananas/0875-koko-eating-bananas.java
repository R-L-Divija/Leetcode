class Solution {
    public boolean func(int p[],int h,int m){
        long t=0;
        for(int x:p){
            t+=(x+m-1)/m;
        }
        return t<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int x:piles){
            r=Math.max(r,x);
        }
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(func(piles,h,m)){
                ans=m;
                r=m-1;
            }else l=m+1;
        }
        return ans;
    }
}