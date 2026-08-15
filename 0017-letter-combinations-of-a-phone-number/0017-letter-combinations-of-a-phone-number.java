class Solution {
    public List<String>p;
    public String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void func(int index,String digits,StringBuilder temp){
       if(index==digits.length()){
        p.add(temp.toString());
        return ;
       }
        String pc=arr[digits.charAt(index)-'0'];
        for(int i=0;i<pc.length();i++){
            temp.append(pc.charAt(i));
            func(index+1,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }
        if(pc.length()==0)func(index+1,digits,temp);
        
    }
    public List<String> letterCombinations(String digits) {
        p=new ArrayList<>();
        func(0,digits,new StringBuilder());
        return p;
    }
}