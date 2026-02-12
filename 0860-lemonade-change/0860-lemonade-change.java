class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n1=0;
        int n2=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) n1++;
            else if(bills[i]==10){
                if(n1!=0){
                n1--;
                 n2++;
                }else return false;
               
            }else{
                if(n2!=0 &&n1!=0){
                    n2--;
                    n1--;
                }else if(n1>=3) {
                    n1-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}