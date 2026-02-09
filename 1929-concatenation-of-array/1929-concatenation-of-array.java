class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr= new int[nums.length+nums.length];
        int i=0;
        for(int x:nums){
            arr[i++]=x;
        }
        for(int x:nums){
            arr[i++]=x;
        }
        return arr;
    }
}