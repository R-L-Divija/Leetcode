class Solution {
    List<List<Integer>>ans;
    public void solve(int index,List<Integer>temp,int nums[]){
        if(index==nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[index]);
        solve(index+1,temp,nums);

        temp.remove(temp.size()-1);
        solve(index+1,temp,nums);

    }
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        solve(0,new ArrayList<>(),nums);
        return ans;
    }
}