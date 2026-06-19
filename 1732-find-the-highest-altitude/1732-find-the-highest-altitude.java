class Solution {
    
 
    public int largestAltitude(int[] a) {
        int max=0;
    int s=0;
    for(int i=0;i<a.length;i++){
        s+=a[i];
        max=Math.max(max,s);}
         return max;
    }
   
}