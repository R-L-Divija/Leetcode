class Solution {
    public int trailingZeroes(int n) {
       /* if(n==0)return 0;
        int f=1;
        int c=0;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        while(f>0){
            int rem =f%10;
            if(rem==0)c++;
            f/=10;
        }
        return c;*/
        int c=0;
        while(n>0){
            n/=5;
            c+=n;
        }
        return c;
    }
}