class Solution {
    public int maximumCount(int[] nums) {
        
       int p= (int)Arrays.stream(nums).filter(i->i>0).count(); 
int n=(int)Arrays.stream(nums).filter(i->i<0).count(); 
return Math.max(p,n);
    }
}