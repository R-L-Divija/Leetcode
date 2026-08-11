class Solution {
    public double func(double x,long n){
        if(n==0)return 1.0;
        double half=func(x,n/2);
    
       if(n%2==0)return half*half;
     
        return half*half*x;
    }
    public double myPow(double x, int n) {
        long N=n;
        if(n<0){
             return 1.0/func(x,-N);
        }
        return func(x,N);
    }
}