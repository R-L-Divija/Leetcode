class Solution {
    public String reverseWords(String s) {
        String s1[]=s.trim().split("\\s+");
        StringBuilder s2=new StringBuilder();
        for(int i=s1.length-1;i>0;i--){
            s2.append(s1[i]+" ");
        }
        s2.append(s1[0]);
        return s2.toString();
    }
}