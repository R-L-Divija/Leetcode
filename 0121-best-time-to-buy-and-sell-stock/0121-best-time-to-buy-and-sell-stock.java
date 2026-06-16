class Solution {
    public int maxProfit(int[] p) {
     int sell=Integer.MIN_VALUE;
     int buy=Integer.MAX_VALUE;
     for(int i=0;i<p.length;i++){
        buy=Math.min(buy,p[i]);

        sell=Math.max(sell,p[i]-buy);
     }
return sell;
    }
}