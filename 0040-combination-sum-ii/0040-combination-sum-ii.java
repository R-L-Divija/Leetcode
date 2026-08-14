class Solution {
    List<List<Integer>>p;
    public void func(int a[],int index,int sum,int t,List<Integer>temp){
        if(sum==t){
            p.add(new ArrayList<>(temp));
            return;
        }
        if(sum>t){
            return;
        }
      for(int i=index;i<a.length;i++){
        if(i>index && a[i]==a[i-1]){
            continue;
        }
        if(sum+a[i]>t){
            break;
        }

         temp.add(a[i]);
func(a,i+1,sum+a[i],t,temp);
 temp.remove(temp.size()-1);
      }
        
        
        
       
     
    }
    public List<List<Integer>> combinationSum2(int[] a, int t) {
        p=new ArrayList<>();
        Arrays.sort(a);
        func(a,0,0,t,new ArrayList<>());
        return p;
    }
}