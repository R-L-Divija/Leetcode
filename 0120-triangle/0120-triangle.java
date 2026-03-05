class Solution {
     public int func(int r,int c,List<List<Integer>> mat,List<List<Integer>> dp){
        if(r<0||c<0||r>=mat.size()||c>=mat.get(r).size())return Integer.MAX_VALUE;
        if(r==mat.size()-1)return mat.get(r).get(c);

        

        if(dp.get(r).get(c)!=Integer.MAX_VALUE)return dp.get(r).get(c);
        int m1=func(r+1,c+1,mat,dp);
        int m2=func(r+1,c,mat,dp);
        int val=mat.get(r).get(c)+Math.min(m1,m2);
      
        dp.get(r).set(c,val);
          return val;
     }

    public int minimumTotal(List<List<Integer>> mat) {
    
        List<List<Integer>>dp=new ArrayList<>();
        for(int i=0;i<mat.size();i++){
            dp.add(new ArrayList<>());
        }
        for(int i=0;i<dp.size();i++){
            for(int j=0;j<mat.get(i).size();j++){
                dp.get(i).add(Integer.MAX_VALUE);
            }
        }
        return func(0,0,mat,dp);
    }
}