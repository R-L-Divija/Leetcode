class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int m=n/3;
        int sum=0;
        for(int i=n-2;i>=m;i-=2){
                 sum+=piles[i];
        }
        return sum;
    }
}