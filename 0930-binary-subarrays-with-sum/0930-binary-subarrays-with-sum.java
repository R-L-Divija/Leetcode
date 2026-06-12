class Solution {
   
    public int numSubarraysWithSum(int[] nums, int k) {
        int c=0;
        int s=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
         s+=nums[i];
         c+=map.getOrDefault(s-k,0);
         map.put(s,map.getOrDefault(s,0)+1);
        }
        return c;
    }
}