class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')i++;
        int f=1;
        if(i<n && (s.charAt(i)=='+'||s.charAt(i)=='-')){
            if(s.charAt(i)=='-')f=-1;
            i++;
        }
        long s1=0;
        while(i<n && Character.isDigit(s.charAt(i))){
             s1=s1*10+(s.charAt(i)-'0');
             if(s1*f>Integer.MAX_VALUE)return Integer.MAX_VALUE;
             if(s1*f<Integer.MIN_VALUE)return Integer.MIN_VALUE;
             i++;            
        }
        return (int) s1*f;
    }
}