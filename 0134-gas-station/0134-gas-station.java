class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc)return -1;
        int rg=0;
        int st=0;
         for(int i=0;i<gas.length;i++){
            rg=rg+(gas[i]-cost[i]);
            if(rg<0){
              st=i+1;
              rg=0;
            }
         }
         return st;
    }
}