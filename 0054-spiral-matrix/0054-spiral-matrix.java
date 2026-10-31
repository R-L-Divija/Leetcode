class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer>ans=new ArrayList<>();
        int t=0;
        int l=0;
        int r=m[0].length-1;
        int b=m.length-1;
        while(t<=b &&l<=r){
            
            for(int i=l;i<=r;i++){
                ans.add(m[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                ans.add(m[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                   ans.add(m[b][i]);
                }
            }
            b--;
            if(l<=r){
                for(int i=b;i>=t;i--){
                    ans.add(m[i][l]);
                }
            }
            l++;

        }
        return ans;
    }
}