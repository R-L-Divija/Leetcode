
class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int rows = m.length;
        int cols = m[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int value = m[mid / cols][mid % cols];

            if (value == t) {
                return true;
            } else if (value < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
