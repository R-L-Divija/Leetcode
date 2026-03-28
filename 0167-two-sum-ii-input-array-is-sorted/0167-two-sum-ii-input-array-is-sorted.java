class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
      
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int r=0;r<numbers.length;r++){
       
            int v=target-numbers[r];
            if(map.containsKey(v)){
                arr[0]=map.get(v)+1;
                arr[1]=r+1;
                break;
            }
            else map.put(numbers[r],r);
        }
        
        return arr;
    }
}