class Solution {
    List<List<String>>p;
    public boolean isP(String s){
        StringBuilder s1=new StringBuilder(s).reverse();
       
        return s1.toString().equals(s);
    }
    public void func(int index,String s,List<String>temp){

        if(index==s.length()){
            p.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            String subs=s.substring(index,i+1);
            if(isP(subs)){
                temp.add(subs);
                func(i+1,s,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
       p=new ArrayList<>();
       func(0,s,new ArrayList<>());
       return p; 
    }
}