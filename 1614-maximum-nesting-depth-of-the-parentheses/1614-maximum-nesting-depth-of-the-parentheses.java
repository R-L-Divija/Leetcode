class Solution {
    public int maxDepth(String s) {
        int op=0;
        int max=0;
        for(char c:s.toCharArray()){
             if(c=='('){
                op++;
                max=Math.max(op,max);
             }if(c==')'){
                op--;
             }
        }
        return max;
    }
}