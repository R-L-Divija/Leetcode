class Solution {
    public int maxSubArray(int[] arr) {
        int max=arr[0];
        int c=arr[0];
        for(int i=1;i<arr.length;i++){
            c=Math.max(arr[i],c+arr[i]);
            max=Math.max(max,c);
        }
        return max;
    }
}