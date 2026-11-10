class Solution {
    public List<List<Integer>>ans;
    public void solve(boolean[]used,List<Integer>temp,int[] nums){
    if(temp.size()==nums.length){
     ans.add(new ArrayList<>(temp));
     return;
    }
    for(int i=0;i<nums.length;i++){
        if(!used[i]){
            used[i]=true;
            temp.add(nums[i]);
            solve(used,temp,nums);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
    }
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        solve(used,new ArrayList<>(),nums);
        return ans;
    }
}