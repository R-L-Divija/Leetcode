class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        char[] c=s.toCharArray();
        int c1=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='1')c1++;
        }
        return c1;
    }
}