class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
         int s=0;
         int j=0;
    
        Arrays.sort(cost);
       for(int x:cost){
        s+=x;
       }
        for(int i=n-3;i>=0;i-=3){
          s-=cost[i];
          
        }
        return s;
    }
}