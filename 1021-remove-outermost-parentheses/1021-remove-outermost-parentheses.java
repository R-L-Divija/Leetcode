class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder s1=new StringBuilder();
        int op=0;
        for(char c:s.toCharArray()){
            if(c=='('&&op++>0)s1.append('(');
              if(c==')'&&op-->1)s1.append(')');
        }
        return s1.toString();
    }
}