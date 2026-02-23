class Solution {
    public boolean func(int[] arr,int days,int m){
        int d=1;
        int l=0;
        for(int x:arr){
            if(l+x<=m){
                l+=x;
            }else{
                d++;
                l=x;
            }
        }
        return d<=days;
    }
    public int shipWithinDays(int[] w, int days) {
        int l=0;
        int h=0;
        for(int x:w){
            l=Math.max(l,x);
            h+=x;
        }
        while(l<h){
            int m=l+(h-l)/2;
            if(func(w,days,m)){
                h=m;
            }else l=m+1;
        }
        return l;
    }
}