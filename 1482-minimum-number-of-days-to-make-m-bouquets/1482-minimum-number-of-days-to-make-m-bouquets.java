class Solution {
    public boolean func(int[] d,int m,int k,int c){
        int b=0;
        int cou=0;
        for(int x:d){
            if(x<=c){
                cou++;
                if(cou==k){
                    b++;
                 cou=0;
                }
            }else{
                cou=0;
            }
        }
        return b>=m;
    }
    public int minDays(int[] d, int m, int k) {
        if((long)m*k>d.length)return -1;
        int l=1;
        int h=0;
        for(int x:d){
            h=Math.max(h,x);
        }
        while(l<h){
            int mid=l+(h-l)/2;
            if(func(d,m,k,mid)){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}