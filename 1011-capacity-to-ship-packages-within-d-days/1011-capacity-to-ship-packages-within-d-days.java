class Solution {
    public boolean func(int a[],int d,int m){
        int s=0;
        int d1=1;
        for(int x:a){
            if(s+x<=m){
                s+=x;
            }else{
                d1++;
                 s=x;
            }
        }
        return d1<=d;
    }
    public int shipWithinDays(int[] w, int d) {
        int l=0;
        int r=0;
        for(int x:w){
            l=Math.max(l,x);
            r+=x;
        }
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(func(w,d,m)){
                ans=m;
                r=m-1;
            }else l=m+1;
        }
        return ans;
    }
}