class Solution {
    public String processStr(String s) {
     StringBuilder s1=new StringBuilder();
     for(char x:s.toCharArray()){
        if(x=='*'){
            if(s1.length()>0){
                s1.deleteCharAt(s1.length()-1);
            }
        }
        else if(x=='#'){
             if(s1.length()>0){
              
                s1.append(s1);
            }
        }
        else if(x=='%'){
            if(s1.length()>0){
                s1.reverse();
            }
            }
            else{
                s1.append(x);
            }
     }
     return s1.toString();   
    }
}