class Solution {
    public boolean rotateString(String s, String goal) {
        String s1=s+s;
        return s1.contains(goal);
    }
}