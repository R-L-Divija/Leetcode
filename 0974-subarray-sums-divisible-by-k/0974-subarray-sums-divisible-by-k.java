class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        long s=0;
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            int r=(int)(s%k);
            if(r<0)r+=k;
           if(map.containsKey(r)){
            c+=map.get(r);
            map.put(r,map.getOrDefault(r,0)+1);
           }else map.put(r,1);
        }
        return c;
    }
}