class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        
        int left = 0, right = x, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2; // avoid overflow
            long sq = mid * mid;
            
            if (sq == x) {
                return (int) mid;  // perfect square
            } else if (sq < x) {
                ans = (int) mid;   // store possible answer
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return ans;
    }
}
