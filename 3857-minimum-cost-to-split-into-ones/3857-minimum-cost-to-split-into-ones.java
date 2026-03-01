class Solution {
    int sum;
    void func(int a,int b){
        if(b<1)return;
        sum+=a*b;
        func(1,b-1);
    }
    public int minCost(int n) {
        sum=0;
        func(1,n-1);
        return sum;
    }
}