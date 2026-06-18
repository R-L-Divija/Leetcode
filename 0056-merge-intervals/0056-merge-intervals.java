class Solution {
    public int[][] merge(int[][] arr) {
       Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
       ArrayList<int[]>p=new ArrayList<>();
       int ps=arr[0][0];
       int pe=arr[0][1];

       for(int i=1;i<arr.length;i++){
        if(arr[i][0]<=pe){
         pe=Math.max(pe,arr[i][1]);
        }else{
            p.add(new int[]{ps,pe});
             ps=arr[i][0];
             pe=arr[i][1];
        }
       }
        p.add(new int[]{ps,pe});

return p.toArray(new int[p.size()][]);
    }
}