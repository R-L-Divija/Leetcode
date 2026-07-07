class Solution {
    public long sumAndMultiply(int n) {
        long s=0;
        long s1=0;
        while(n>0){
            long d1=n%10;
            s1+=d1;
            if(d1!=0){
                s=(s+d1)*10;
            }
            n/=10;
        }
        s/=10;
        long s2=0;
        while(s>0){
            long d2=s%10;
            s2=(s2+d2)*10;
            s/=10;
        }
        s2/=10;
        return s2*s1;
    }
}