class Solution {
    List<List<Integer>>p;
    public void func(int []a,int index,int sum,int t,List<Integer>temp){
        if(sum==t){
           p.add(new ArrayList<>(temp));
           return;
        }
        if(sum>t||index==a.length)return;
         
         if(sum<=t){
        temp.add(a[index]);
        func(a,index,sum+a[index],t,temp);
         }
        temp.remove(temp.size()-1);
        func(a,index+1,sum,t,temp);

    }
    public List<List<Integer>> combinationSum(int[] a, int t) {
        p=new ArrayList<>();
        func(a,0,0,t,new ArrayList<>());
        return p;
    }
}