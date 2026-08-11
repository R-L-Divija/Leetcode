class Solution {
    public int func(String s,int i,long num,int f){
        if(i==s.length() || !Character.isDigit(s.charAt(i))){
            return (int)num*f;
        }
        int d=s.charAt(i)-'0';
          num=num*10+d;
        if(num*f >Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(num*f<Integer.MIN_VALUE)return Integer.MIN_VALUE;
      
        return func(s,i+1,num,f);
    }
    public int myAtoi(String s) {
       int i=0;
       int n=s.length();
       while(i<n && s.charAt(i)==' ')i++;
int f=1;
       if(i<n &&( s.charAt(i)=='+'||s.charAt(i)=='-')){
        if(s.charAt(i)=='-'){
f=-1;
        }i++;
       }
       return func(s,i,0,f);
    }
}