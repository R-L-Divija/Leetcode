class Solution {
    public int reverseBits(int n) {
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String s1 = new StringBuilder(s).reverse().toString();
        return (int) Long.parseLong(s1, 2);
    }
}
