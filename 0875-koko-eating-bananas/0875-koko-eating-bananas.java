class Solution {
    boolean func(int[] a,int h,int m){
        long t=0;
        for(int x:a){
            t+=(x+m-1)/m;
        }
        return t<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        int a=0;
        for(int x:piles){
          r=Math.max(r,x);
        }
        while(l<=r){
            int mid=(l+r)/2;
            if(func(piles,h,mid)){
                a=mid;
                r=mid-1;
            }else 
            l=mid+1;
        }
        return a;
    }
}