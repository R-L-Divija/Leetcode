class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int a=0,b=0;
   for(char c:s1){
a+=c;
   }
    for(char c:t1){
b+=c;
   }
   return (char)(b-a);
    }
}