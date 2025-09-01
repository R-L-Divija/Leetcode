class Solution {
    public int hammingDistance(int x, int y) {
        String s=Integer.toBinaryString(x);
         String s1=Integer.toBinaryString(y);
         while(s.length()<s1.length()){
            s="0"+s;
         }
         while(s.length()>s1.length()){
            s1="0"+s1;
         }

         int c=0;
         char[] c1=s.toCharArray();
         char[] c2=s1.toCharArray();
         for(int i=0;i<c2.length;i++){
            if(c1[i]!=c2[i])c++;
         }
         return c;
    }
}