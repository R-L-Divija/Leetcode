class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char[] s1=new char[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            s1[j++]=s[i];
        }
        for(int i=0;i<n;i++){
s[i]=s1[i];
        }
    }
}