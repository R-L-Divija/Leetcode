class Solution {
    public int passThePillow(int n, int t) {
        t %= (n - 1) * 2;
        if (t < n) {
            return 1 + t;
        } else {
            return n - (t - (n - 1));
        }
    }
}