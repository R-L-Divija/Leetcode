class Solution {
    public int search(int[] arr, int t) {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==t)return m;
            else if(arr[m]<t)l=m+1;
            else r= m-1;
        }
        return -1;
    }
}