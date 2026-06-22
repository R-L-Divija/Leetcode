class Solution {
    public boolean func(int a[],int m,int k,int mid){
        int t=0;
        int c=0;

        for(int x:a){
            if(x<=mid){
                c++;
            if(c==k){
                t++;
                c=0;

            }
        }else c=0;
       
    } return t>=m;
    }
    public int minDays(int[] a, int m, int k) {
        if((long)m*k>a.length)return -1;
        int l=0;
        int r=0;
        int ans=0;
        for(int x:a){
          r=Math.max(x,r);
        }
        while(l<=r){

            int mid=l+(r-l)/2;
            if(func(a,m,k,mid)){
                ans=mid;
                r=mid-1;
            }else l=mid+1;
        }
        return ans;
    }
}