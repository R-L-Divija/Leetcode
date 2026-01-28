class NumArray {
    ArrayList <Integer>res=new ArrayList<>();
    public NumArray(int[] nums) {
        int s=0;
        for(int x:nums){
             s+=x;
            res.add(s);
        }
    }
    
    public int sumRange(int left, int right) {
if(left==0)return res.get(right);
        return res.get(right)-res.get(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */