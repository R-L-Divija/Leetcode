class Solution {
 
    public int maxScore(int[] a, int k) {
        int l=0;
        int s=0;
        for(int i=0;i<k;i++){
             s+=a[i];
        }
        int max=0;
        max=s;
        int last=a.length-1;
        for(int r=k-1;r>=0;r--){
            s-=a[r];
            s+=a[last--];
            max=Math.max(max,s);
        }
       return max;
    }
}