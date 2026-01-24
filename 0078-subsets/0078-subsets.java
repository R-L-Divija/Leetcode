class Solution {
    public void gss(int[]a,int index,ArrayList<Integer>ans,List<List<Integer>>res){
        if(a.length==index){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(a[index]);
        gss(a,index+1,ans,res);
        ans.remove(ans.size()-1);
        gss(a,index+1,ans,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        gss(nums,0,new ArrayList<>(),res);
        return res;
    
    }
}