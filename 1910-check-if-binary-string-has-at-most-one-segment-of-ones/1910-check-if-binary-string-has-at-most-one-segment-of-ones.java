class Solution {
    public boolean checkOnesSegment(String s) {
 
        char[] c=s.toCharArray();
        for(int i=1;i<c.length;i++){
            if(c[i-1]=='0'&&c[i]=='1')return false;
        }
        return true;
    }
}