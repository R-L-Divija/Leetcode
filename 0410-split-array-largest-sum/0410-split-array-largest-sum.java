//import java.util.Arrays;
class Solution {
    public boolean func(int a[],int k,int m){
        int s=0;
        int t=1;
        for(int x:a){
            if((s+x)<=m)s+=x;
            else{
                t++;
                s=x;
            }
        }return t<=k;
    }
    public int splitArray(int[] nums, int k) {
int l=0;
int r=0;
int a=0;
for(int x:nums){
    l=Math.max(x,l);
    r+=x;
}
while(l<=r){
    int m=l+(r-l)/2;
    if(func(nums,k,m)){
        a=m;
        r=m-1;
    }else l=m+1;
}

return a;
}}