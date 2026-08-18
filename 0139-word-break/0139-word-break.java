class Solution {
    public boolean func(int index,String s,List<String>w,List<String>temp,int []dp){
        if(index==s.length()){
            return true;
        }
        if(dp[index]!=-1)return dp[index]==1;
        for(int i=index;i<s.length();i++){
            String s1=s.substring(index,i+1);
            if(w.contains(s1)){
                temp.add(s1);
                if(func(i+1,s,w,temp,dp)){
                    dp[index]=1;
                    return true;
                }
              
            }
        }
        dp[index]=0;
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return func(0,s,wordDict,new ArrayList<>(),dp);
        
    }
}