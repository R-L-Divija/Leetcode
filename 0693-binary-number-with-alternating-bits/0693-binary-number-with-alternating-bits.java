class Solution {
    public boolean hasAlternatingBits(int n) {
        String a=Integer.toBinaryString(n);
        char[] c=a.toCharArray();
     for(int i=1;i<c.length;i++){
        if((c[i-1]==c[i]))return false;
     }
     return true;
    }
}