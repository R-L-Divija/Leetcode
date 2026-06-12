class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        long s=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            int rem=(int)(s%k);
            if(map.containsKey(rem)){
                int l=i-map.get(rem);
                max=Math.max(max,l);
            }else map.put(rem,i);
        }
        return  (max>=2)?true:false;
    }
}