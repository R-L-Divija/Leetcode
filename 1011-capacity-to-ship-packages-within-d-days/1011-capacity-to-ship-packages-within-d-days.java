class Solution {

    public boolean ship(int arr[],int d,int cap){
        int l=0;
        int days=1;
        for(int x:arr){
            if(l+x >cap){
                days++;
                l=x;}
                else{
                    l+=x;
                }
        }
        return days<=d;
    }
    public int shipWithinDays(int[] arr, int d) {
      int l=0;
      int h=0;
      int ans=-1;
      for(int x:arr){
        l=Math.max(l,x);
        h+=x;
      }  
      while(l<=h){
        int m=(l+h)/2;
        if(ship(arr,d,m)){
            ans=m;
            h=m-1;
        }else{
            l=m+1;
        }
      }
      return ans;
    }
}