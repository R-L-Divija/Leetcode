class Solution {

public boolean func(int a[],int tar,int m){
    int s=0;
    int t=0;
    for(int x:a){
   t=(x+m-1)/m;
   s+=t;
    }
    return s<=tar;
}
    public int smallestDivisor(int[] a, int t) {
        int l=1;
        int h=0;
        for(int x:a){
            h=Math.max(h,x);
        }
        while(l<h){
            int mid=l+(h-l)/2;
            if(func(a,t,mid)){
                h=mid;
            }else{
                l=mid+1;
            }

        }
        return l;
    }
}