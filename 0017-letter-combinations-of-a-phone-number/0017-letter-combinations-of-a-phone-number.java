class Solution {
    List<String>ans;
    StringBuilder temp;
    String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void func(int index,String digits){
if(index==digits.length()){
    ans.add(temp.toString());
    return ;
}
   String pc = arr[digits.charAt(index) - '0'];
    for(int i=0;i<pc.length();i++){
        temp.append(pc.charAt(i));
        func(index+1,digits);
        temp.deleteCharAt(temp.length()-1);
    }
    if(pc.length()==0)func(index+1,digits);
}
    
    public List<String> letterCombinations(String digits) {
        ans=new ArrayList<>();
        temp=new StringBuilder();
        func(0,digits);
        return ans;
    }
}