class Solution {
    public int maximumUnits(int[][] a, int c) {
        Arrays.sort(a,(a1,b1)->b1[1]-a1[1]);
        int s=0;
        for(int i=0;i<a.length;i++){
            if(a[i][0]<=c){
                s+=a[i][0]*a[i][1];
                c-=a[i][0];
            }
            else{
               s+=c*a[i][1];
               break;
            }
        }
        return s;
    }
}