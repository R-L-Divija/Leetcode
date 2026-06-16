class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int m=0;
        for(int x:nums){
            if(x==1){
                c++;
                m=Math.max(m,c);
            }else if(x==0){
                c=0;
            }
        }
        return m;
    }
}