class Solution {
    public int func(String s,int l,int r){
        while(l>=0&&r<s.length() &&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        int s1=0;
        int e=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            int l1=func(s,i,i);
            int l2=func(s,i,i+1);
            max=Math.max(l1,l2);
            if(max>e-s1+1){
                s1=i-(max-1)/2;
                e=i+max/2;
            }
        }
        return s.substring(s1,e+1);
    }
}