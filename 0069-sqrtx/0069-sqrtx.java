class Solution {
    public int mySqrt(int x) {
        if(x<=1)return x;
        int l=1;
        int r=x;
       
        while(l<=r){
           int  m=l+(r-l)/2;
            long s1=(long)m*m;

            if(s1==x)return m;
            else if(s1<x)l=m+1;
            else r=m-1;
        }
        return r;

    }
}