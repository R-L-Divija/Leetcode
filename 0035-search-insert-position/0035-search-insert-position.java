class Solution {
    public int searchInsert(int[] n, int t) {
        int l=0;
        int r=n.length-1;
        int ans=n.length;
        while(l<=r){
            int m=l+(r-l)/2;
            if(n[m]>=t){
                ans=m;
               r=m-1;
            }else l=m+1;
        }
        return ans;
    }
}