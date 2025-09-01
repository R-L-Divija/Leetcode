class Solution {
    public int findComplement(int num) {
      String s=Integer.toBinaryString(num);
      char[] c=s.toCharArray();
      char[] com=new char[c.length];
      for(int i=0;i<c.length;i++){
        if(c[i]=='0')com[i]='1';
        if(c[i]=='1')com[i]='0';
      } 
      String s1=new String(com);
      return Integer.parseInt(s1,2);
    }
}