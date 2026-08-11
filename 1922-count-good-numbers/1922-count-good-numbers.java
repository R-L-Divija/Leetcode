class Solution {
    public long  M=1000000007L;
    public long func(int x,long n){
        if(n==0)return 1;
        long h=func(x,n/2);
        if(n%2==0)return h*h%M;
        return ((h*h)%M*x)%M;
    }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long a=func(5,even);
        long b=func(4,odd);
        return (int)((a*b)%M);
    }
}