class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer>p=new ArrayList<>();
        int t=0;
        int l=0;
        int b=m.length-1;
        int r=m[0].length-1;

        while(t<=b && l<=r){
            //from left to right at top
            for(int i=l;i<=r;i++){
               p.add(m[t][i]);
            }
            t++; //move top to next row

            //from top to bottom at right
            for(int j=t;j<=b;j++){
                p.add(m[j][r]);
            }
            r--;//move right to prev col

            //from right to left
           if(t<=b){
            for(int k=r;k>=l;k--){
                p.add(m[b][k]);
            }
            b--;
           }

//from bottom to top at left
           if(l<=r){
             for(int x=b;x>=t;x--){
                p.add(m[x][l]);
             }
             l++;
           }
        }
        return p;
    }
}