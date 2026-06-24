class Solution {
    public int maxDepth(String s) {
        int op=0;
        int max=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                op++;
                max=Math.max(max,op);
            }else if(x==')')op--;
        }
        return max;
    }
}