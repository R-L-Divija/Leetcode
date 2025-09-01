class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
       char[] c=s.toCharArray();
       for(int i=0;i<c.length;i++){
        if(c[i]=='0'){
        c[i]='1';
        }
       }
       String s1=new String (c);
       int t=Integer.parseInt(s1,2);
       return t;

    }
}