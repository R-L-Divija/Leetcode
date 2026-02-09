class Solution {
    List<List<Integer>>ans;
    List<Integer>temp;
    public void func(int index,int[] arr){
if(index==arr.length){
    ans.add(new ArrayList<>(temp));
    return;
}
   //take
   temp.add(arr[index]);
   func(index+1,arr);
   temp.remove(temp.size()-1);
   //not take
   func(index+1,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        temp=new ArrayList<>();
        func(0,nums);
        return ans;
    }
}