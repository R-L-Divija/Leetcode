class Solution {
    public int findMaxLength(int[] nums) {
        int s=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                s+=1;
            }else s-=1;
            if(map.containsKey(s)){
                int l=i-map.get(s);
                max=Math.max(max,l);
            }
            else map.put(s,i);
        }return max;

    }
}