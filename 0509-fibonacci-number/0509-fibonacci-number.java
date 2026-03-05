class Solution {

    int func(int n){
        //base
        if(n<=1)return n;
        //logic
        return func(n-1)+func(n-2);
    }
    public int fib(int n) {
     return func(n);
    }
}