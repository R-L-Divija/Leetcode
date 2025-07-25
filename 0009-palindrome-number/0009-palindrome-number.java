class Solution {
    public boolean isPalindrome(int x) {
        boolean isP= x>=0&&Integer.toString(x).equals(new StringBuilder(Integer.toString(x)).reverse().toString());
        return isP;
    }
}