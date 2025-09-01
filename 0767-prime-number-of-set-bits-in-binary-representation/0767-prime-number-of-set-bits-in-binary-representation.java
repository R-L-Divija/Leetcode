class Solution {
    public boolean prime(int c){
       if(c<2)return false;
        for(int i=2;i*i<=c;i++){
            if(c%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
      
        int s=0;
        for(int i=left;i<=right;i++){
            String l1=Integer.toBinaryString(i);
            char ch[]=l1.toCharArray();
            int j=0;
            int c=0;
            while(j<ch.length){
                if(ch[j++]=='1')c++;
            }

if(prime(c))s++;
        }
        return s;
    }
}