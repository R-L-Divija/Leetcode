class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder s3=new StringBuilder();
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int n=Math.min(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i))s3.append(s1.charAt(i));
            else break;
        }
        return s3.toString();
    }

}