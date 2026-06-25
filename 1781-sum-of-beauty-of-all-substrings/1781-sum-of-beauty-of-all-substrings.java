class Solution {

    public int beautySum(String s) {
         int sum=0;
         

        for(int i=0;i<s.length();i++){
            int f[]=new int[26];
            for(int j=i;j<s.length();j++){
                f[s.charAt(j)-'a']++;

                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                
                for(int k=0;k<26;k++){
                    int dif=f[k];
                    if(dif>0){
                    min=Math.min(min,dif);
                     max=Math.max(max,dif);}
                }
                
                 sum+=(max-min);
            }
           
        }
        return sum;
    }
}