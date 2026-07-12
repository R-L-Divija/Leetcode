class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer>map=new HashMap<>();
        int r=1;
        for(int i=0;i<temp.length;i++){
            if(!map.containsKey(temp[i])){
            map.put(temp[i],r++);}
        }
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=map.get(arr[i]);
        }
        return arr1;
    }
}