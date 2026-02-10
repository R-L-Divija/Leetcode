class Solution {
    List<String>res;
    StringBuilder t;

    public void func(int op,int cl,int n){
        if(t.length()==2*n){
            res.add(t.toString());
            return;
        }
       if(op<n){
       t.append('(');
       func(op+1,cl,n);
       t.deleteCharAt(t.length()-1);
       }
       //if(t.length==0||t.charAt(t.length()-1)!)
       if(op>cl){
       t.append(')');
       func(op,cl+1,n);
       t.deleteCharAt(t.length()-1);
       }
    }
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        t=new StringBuilder();
        func(0,0,n);
        return res;
    }
}