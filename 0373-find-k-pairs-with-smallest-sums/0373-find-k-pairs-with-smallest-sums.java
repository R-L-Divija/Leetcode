class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        if(nums1.length==0||nums2.length==0||k==0)return ans;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<Math.min(k,nums1.length);i++){
            pq.add(new int[]{nums1[i]+nums2[0],i,0});
        }
        while(k>0 && !pq.isEmpty()){
         int t[]=pq.poll();
         int i=t[1];
         int j=t[2];

         List<Integer>p=new ArrayList<>();
         p.add(nums1[i]);
         p.add(nums2[j]);
         ans.add(p);
         if(j+1<nums2.length){
            pq.offer(new int[]{nums1[i]+nums2[j+1],i,j+1});
         }
         k--;
        }
        return ans;
    }
}