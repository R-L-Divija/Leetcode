class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2) return false;
            n/=3;
        }
        return true;//only the binary values have 0 and 1 have it;
    }
}