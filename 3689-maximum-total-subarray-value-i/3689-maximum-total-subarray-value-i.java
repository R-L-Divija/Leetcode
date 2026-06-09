class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
            min=Math.min(x,min);
        }
        while(k-->0){
            sum+=max-min;
        }
        return sum;
    }
}