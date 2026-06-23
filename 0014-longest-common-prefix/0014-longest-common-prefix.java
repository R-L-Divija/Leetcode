class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String p1=strs[0];
        String p2=strs[strs.length-1];
        StringBuilder ans=new StringBuilder();
        int n =Math.min(p1.length(),p2.length());
        for(int i=0;i<n;i++){
            if(p1.charAt(i)==p2.charAt(i))ans.append(p1.charAt(i));
            else break;
        }
        return ans.toString();
    }
}