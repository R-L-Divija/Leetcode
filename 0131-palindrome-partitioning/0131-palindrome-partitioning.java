class Solution {
    List<List<String>>ans;
    List<String>temp;
    
     public boolean isP(String s){
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev))return true;
        return false;
     }
    public void func(int index,String s){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=index;i<s.length();i++){
            String subs=s.substring(index,i+1);
            if(isP(subs)){
            temp.add(subs);
            func(i+1,s);
            temp.remove(temp.size()-1);
        }
        }
    }

    public List<List<String>> partition(String s) {
       ans=new ArrayList<>();
       temp=new ArrayList<>();
       func(0,s);
       return ans; 
    }
}