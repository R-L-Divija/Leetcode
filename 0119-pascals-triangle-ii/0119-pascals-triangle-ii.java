class Solution {
    public List<Integer> getRow(int n) {
    List<List<Integer>>dp=new ArrayList<>();
    for(int i=0;i<=n;i++){
        dp.add(new ArrayList<>());
    }
    dp.get(0).add(1);
    for(int i=1;i<=n;i++){
        for(int j=0;j<=i;j++){
            int m1;
            
            if(j==0||j==i)m1=1;
            else m1=dp.get(i-1).get(j)+dp.get(i-1).get(j-1);
             
            dp.get(i).add(m1);
        }
    }
    
    return dp.get(n);
    }
}