class Solution {

    List<List<Integer>>ans;
    public void func(int index,int []nums,List<Integer>temp){
        
        if(index==nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[index]);
        func(index+1,nums,temp);

        temp.remove(temp.size()-1);
        func(index+1,nums,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        func(0,nums,new ArrayList<>());
        return ans;
    
    }
}