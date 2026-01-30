class Solution {
       public int count(int[] a, int k) {
        int frq[]=new int[a.length+1];
        int c=0;
        int ans=0;
        int l=0;
        for(int r=0;r<a.length;r++){
            frq[a[r]]++;
            if(frq[a[r]]==1)c++;
            while(c>k){
                frq[a[l]]--;
                if(frq[a[l]]==0)c--;
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
}