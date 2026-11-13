class Solution {
    public int countPrimes(int n) {
        boolean p[]=new boolean[n+1];

        if(n==0||n==1)return 0;
        Arrays.fill(p,true);
        p[0]=false;
        p[1]=false;

        for(int i=2;i*i<=n;i++){
            if(p[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(p[i]==true)c++;
        }
        return c;
    }
}