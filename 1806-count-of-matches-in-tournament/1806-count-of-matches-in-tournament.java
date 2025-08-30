/*class Solution {
    public int loop(int n){
        int s=0;
        int org=n;
        int a= n/2;
         s+=a;
         return org-a; 
    }
    public int numberOfMatches(int n) {
        int ans=0;
        while(n>1){
             ans=loop(n);
        }
        return ans;
    }
}*/
class Solution {
     public int numberOfMatches(int n) {
        return n-1;
     }
}
