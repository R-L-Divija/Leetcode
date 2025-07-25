class Solution {
    public int maxSum(int[] nums) {
        int s;
        if(nums.length==1){
            return nums[0];
        }
boolean p=Arrays.stream(nums).allMatch(x->x<0);
if(p==true){
    int mx=Arrays.stream(nums).max().getAsInt();
    return mx;
}
else{
        int[] unique=Arrays.stream(nums).distinct().toArray();
        s=0;
        for(int i=0;i<unique.length;i++){
            if(unique[i]>0){
            s+=unique[i];
            }
        }
}
        return s;
    }

}