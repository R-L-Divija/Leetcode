class Solution {
    public int func(String s, int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        int st=0;
        int e=0;
       int m=Integer.MIN_VALUE;
        if(s.length()==1)return s;
        for(int i=0;i<s.length();i++){
            int ol=func(s,i,i);
            int el=func(s,i,i+1);
            m=Math.max(ol,el);

            if(m>e-st+1){
                st=i-(m-1)/2;
                e=i+m/2;
            }
        }
        return s.substring(st,e+1);
    }
}