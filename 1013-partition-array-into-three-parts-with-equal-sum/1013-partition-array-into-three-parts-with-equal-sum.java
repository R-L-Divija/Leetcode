class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int s=0,s1=0;
       for(int x:arr){
        s+=x;
       } 
       if(s%3!=0)return false;
     int c=0;
     for(int x:arr){
        s1+=x;
        if(s1==s/3){
         c++;
          s1=0;
        }
       } 
      
       if(c>=3)return true;
       return false;
    }
}