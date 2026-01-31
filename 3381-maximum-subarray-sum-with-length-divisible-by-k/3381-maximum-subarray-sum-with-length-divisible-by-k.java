class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        HashMap<Integer,Long>map=new HashMap<>();
        long max=Long.MIN_VALUE;
        map.put(0,0L);
        long s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
             int rem=(i+1)%k;
            //  if(rem<0)rem=rem+k;
             if(map.containsKey(rem)){
                   max=Math.max(max,s-map.get(rem));
                   map.put(rem,Math.min(map.get(rem),s));
             }else{
                map.put(rem,s);
             }
        }
        return (max==Long.MIN_VALUE)?0:max;
    }
}