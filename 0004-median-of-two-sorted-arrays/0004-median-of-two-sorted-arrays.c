double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int size=nums1Size+nums2Size;
    int* nums3=(int *)malloc(size * sizeof(int));
    for(int i=0;i<nums1Size;i++){
        nums3[i]=nums1[i];
    }
for(int i=0;i<nums2Size;i++){
    nums3[nums1Size+i]=nums2[i];
}
for(int i=0;i<size-1;i++){
    for(int j=0;j<size-i-1;j++){
        if(nums3[j]>nums3[j+1]){
            int t=nums3[j];
nums3[j]=nums3[j+1];
nums3[j+1]=t;
        }
    }
}
double res;
if(size%2==0){
 int  n=size/2;
   res=(nums3[n-1]+nums3[n])/2.0;
}
else{

res=nums3[size/2];
}
free(nums3);
return res;
}