class Solution {
    public int loop(int num){
          int d=0;
          int s=0;
            while(num>0){
            d=num%10;
            s+=d;
            num/=10;
        }
        return s;

    }
    public int addDigits(int num) {
        int s1=0;
     while(num>9){
          s1=loop(num);
          num=s1;
     }
      
       
        return num;
    }
}