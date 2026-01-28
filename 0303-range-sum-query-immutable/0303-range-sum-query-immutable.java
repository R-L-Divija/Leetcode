class NumArray {
    ArrayList <Integer>res=new ArrayList<>();
    public NumArray(int[] nums) {
        for(int x:nums){
            res.add(x);
        }
    }
    
    public int sumRange(int left, int right) {
        int[] arr=new int[res.size()];
        int sum=0;
        for(int i=left;i<=right;i++){
        sum+=res.get(i);
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */