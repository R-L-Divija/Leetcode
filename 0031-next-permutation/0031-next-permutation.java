class Solution {
    public void rev(int a[],int l){
        int r=a.length-1;
        while(l<=r){
            int t=a[r];
            a[r]=a[l];
            a[l]=t;
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pindx=-1;
        int pv=0;
        for(int i=nums.length-1;i>=1;i--){
          if(nums[i-1]<nums[i]){
            pindx=i-1;
            pv=nums[i-1];break;
          }
        }
         if (pindx == -1) {
            rev(nums, 0);
            return;
        }
        for(int i=nums.length-1;i>=pindx+1;i--){
            if(nums[i]>pv){
                int temp=nums[i];
                nums[i]=nums[pindx];
                nums[pindx]=temp; 
                break;
            }
           
        }
        rev(nums,pindx+1);
    }
}