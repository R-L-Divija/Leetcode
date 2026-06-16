class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer,Integer>map=new HashMap<>();
    int n=nums.length/2;
    for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
    }
    for(int x:nums){
       if(map.get(x)>n)return x;
    }
    return 0;
    }
}