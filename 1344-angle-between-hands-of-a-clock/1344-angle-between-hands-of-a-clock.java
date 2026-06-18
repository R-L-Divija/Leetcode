class Solution {
    public double angleClock(int h, int m) {
        double m1=6*m;
        double m2=30*(h%12)+0.5*(m);
        double diff=Math.abs(m2-m1);
        return Math.min(diff,360.0-diff);
    }
}