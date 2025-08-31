class Solution {
    public int commonFactors(int a, int b) {
        int g=0;
        int c=0;
        if(a>b)g=a;
        g=b;
        for(int i=1;i<=g;i++){
            if(a%i==0&&b%i==0)c++;
        }
        return c;
    }
}