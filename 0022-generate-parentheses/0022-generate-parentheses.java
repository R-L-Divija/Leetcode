class Solution {
    List<String>ans;
    public void func(String s,int o,int c,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(o<n){
             func(s+"(",o+1,c,n);
        }
        if(c<o){
             func(s+")",o,c+1,n);
        }
      
    }
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        func("",0,0,n);
        return ans;
    }
}