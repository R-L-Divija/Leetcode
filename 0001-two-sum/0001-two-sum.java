class Solution {
    public int[] twoSum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        
        
        for(int i=0;i<nums.length;i++){
           
            if(map.containsKey(k-nums[i])){
                return new int[]{map.get(k-nums[i]),i};
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
    //     int[] a=new int[2];
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;i++){
    //         if(nums[i]+nums[j]==target){
    //             a[0]=i;
    //             a[1]=j;
    //             return a;
    //         }
    //     }
    //    }
    //     return a;