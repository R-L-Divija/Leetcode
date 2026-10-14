class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums){
           if(!set.add(x))return true;
           else set.add(x);
        }
        return false;
    }
}