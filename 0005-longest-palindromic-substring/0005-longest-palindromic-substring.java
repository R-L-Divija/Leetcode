class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        return s;
String lps="";
        for(int i=1;i<s.length();i++){
            //odd length
            int l=i;
            int h=i;
            while(s.charAt(l)==s.charAt(h)){
                l--;
                h++;
                if(l==-1||h==s.length())
                break;
            }
            String p=s.substring(l+1,h);
            if(p.length()>lps.length()){
                lps=p;
            }
            //even length
               l=i-1;
             h=i;
            while(s.charAt(l)==s.charAt(h)){
                l--;
                h++;
                if(l==-1||h==s.length())
                break;
            }
            p=s.substring(l+1,h);
            if(p.length()>lps.length()){
                lps=p;
            }
        }
        return lps;
    }
}