class Solution {
    public boolean func(int[] a,int d,int m){
        int l=0;
        int day=1;
        for(int x:a){
            if(l+x<=m){
                l+=x;
            }else{
                day++;
                l=x;
            }
        }
        return day<=d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int h=0;
        for(int x:weights){
            l=Math.max(l,x);
            h+=x;
        }
        while(l<h){
            int m=l+(h-l)/2;
            if(func(weights,days,m)){
                h=m;
            }else{
                l=m+1;
            }
        }
return l;
    }
}