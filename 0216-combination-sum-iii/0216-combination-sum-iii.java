class Solution {
    List<List<Integer>>ans;
    List<Integer>temp;
    public void func(int index,int sum,int[] arr,int k ,int n){
          //if (sum > n || temp.size() > k) return;
        if(index==arr.length){
            if(sum==n && temp.size()==k){
            ans.add(new ArrayList<>(temp));
            }
            return;
        }

        //take
        temp.add(arr[index]);
        func(index+1,sum+arr[index],arr,k,n);
        //backtrack
        temp.remove(temp.size()-1);
        //nottake
        func(index+1,sum,arr,k,n);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans=new ArrayList<>();
        temp=new ArrayList<>();
        int[] arr={1,2,3,4,5,6,7,8,9};
        func(0,0,arr,k,n);
        return ans;
    }
}