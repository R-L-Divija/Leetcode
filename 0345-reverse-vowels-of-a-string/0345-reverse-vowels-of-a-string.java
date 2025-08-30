class Solution {
        public boolean isVowel(char c){
            c=Character.toLowerCase(c);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return true;
return false;
        }
    public String reverseVowels(String arr) {
        char[] s=arr.toCharArray();
        int n=s.length;
        int start=0;
        int end=n-1;
        while(start<end){
            if(isVowel(s[start])&& isVowel(s[end])){
                char t=s[start];
                s[start]=s[end];
                s[end]=t;
                start++;
                end--;
            }
            else if(!isVowel(s[start])){
                start++;
            }else{
                end--;
            }
        }
        return new String(s);
  
    }

}