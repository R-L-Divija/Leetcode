class Solution {
    public boolean checkIfExist(int[] arr) {
      
        ArrayList<Integer>res=new ArrayList<>();
        for(int x:arr){
        res.add(x);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
          if(i!=j &&arr[i]==2*arr[j]){
            return true;
          }
          }
        }
        return false;
    }
}