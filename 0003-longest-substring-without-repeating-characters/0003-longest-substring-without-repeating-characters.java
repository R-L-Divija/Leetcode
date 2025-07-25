class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet=new HashSet<>();
        int mx=0,l=0;
for(int r=0;r<s.length();r++){
    while(charSet.contains(s.charAt(r))){
    charSet.remove(s.charAt(l));
    l++;
    }
       charSet.add(s.charAt(r));
       mx=Math.max(mx,r-l+1);
    }
      return mx;
    }
  
}