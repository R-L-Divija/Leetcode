class Solution {
    public int countOdds(int low, int high) {
        int c=high-low+1;
        if((low&1)==1 &&(high&1)==1)
        return (c/2)+1;

        return c/2;
    }
}