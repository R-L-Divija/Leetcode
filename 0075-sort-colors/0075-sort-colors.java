class Solution {
    public void sortColors(int[] nums) {
        int c[]=new int[3];
    for(int x:nums){
        c[x]++;
    }
    int j=0;
    for(int i=0;i<=2;i++){
        while(c[i]>0){
      nums[j++]=i;
      c[i]--;}
    }
   
    }
}