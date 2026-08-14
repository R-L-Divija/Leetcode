class Solution {
    List<List<Integer>>p;
    public void func(int a[],int index,List<Integer>temp){
        
            p.add(new ArrayList<>(temp));
        
        for(int i=index;i<a.length;i++){
            if(i > index &&a[i]==a[i-1])continue;
            temp.add(a[i]);
            func(a,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    p=new ArrayList<>();
    Arrays.sort(nums);
    func(nums,0,new ArrayList<>());
    return p;
    }
}