class Solution {
    public int subarraySum(int[] nums, int k) {
Map<Integer,Integer>map=new HashMap<>();
map.put(0,1);
int s=0,c=0;
for(int x:nums){
    s+=x;
    c+=map.getOrDefault(s-k,0);
    map.put(s,map.getOrDefault(s,0)+1);
}
return c;
    }
}