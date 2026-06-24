class NumArray {
      int seg[];
      int size;

    public NumArray(int[] nums) {
        int n=nums.length;
        seg=new int[2*n];
        size=n;
        for(int i=0;i<n;i++){
            seg[i+n]=nums[i];
        }
        for(int i=n-1;i>0;i--){
            seg[i]=seg[2*i]+seg[2*i+1];
        }
    }
    
    public void update(int index, int val) {
        index+=size;
        seg[index]=val;

        while(index>1){
            index/=2;
            seg[index]=seg[2*index]+seg[2*index+1];
        }
    }
    
    public int sumRange(int l, int r) {
        l+=size;
        r+=size;
      int s=0;
        while(l<=r){
            if((l&1)==1)s+=seg[l++];
            if((r&1)==0)s+=seg[r--];
            l/=2;
            r/=2;
        }
        return s;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */