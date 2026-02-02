class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String p1=strs[0];
        String p2=strs[strs.length-1];
        int n=Math.min(p1.length(),p2.length());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(p1.charAt(i)==p2.charAt(i))sb.append(p1.charAt(i));
            else break;
        }
        return sb.toString();
    }
}