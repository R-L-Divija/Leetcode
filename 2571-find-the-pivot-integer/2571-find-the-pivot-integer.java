class Solution {
    public int pivotInteger(int n) {
        int t=(n*(n+1))/2;
        int s=(int)Math.sqrt(t);
        if(s*s==t)return s;
        return -1;
    }
}