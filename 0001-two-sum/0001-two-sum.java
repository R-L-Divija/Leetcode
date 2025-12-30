class Solution {
    public int[] twoSum(int[] nums, int target) {

    Map<Integer,Integer> a=new HashMap<>();
    int n=nums.length;
    for(int i=0;i<n;i++){
        int t=target-nums[i];
        if(a.containsKey(t)){
            return new int[]{a.get (t),i};
        }
        a.put(nums[i] ,i);
    }
    
    return new int[0];
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