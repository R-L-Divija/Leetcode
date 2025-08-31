class Solution {
    public int passThePillow(int n, int t) {
  
        
         t %= (n - 1) * 2;//cycle pass
         if (t < n) {
            return 1 + t;
        } 
        return n-(t-(n-1));

        
          
    }
}