class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        char[] c=s.toCharArray();
        int s1=0;
        for(int i=0;i<c.length;i++){
        int digit = c[i] - '0';
        if(i%2!=0)
        s1-=digit;
        else
        s1+=digit;
        }
        return s1;
    }
}