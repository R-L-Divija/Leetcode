class Solution {
    public int func(int a[],int k){
        int l=0;
        int r=0;
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<a.length){
            map.put(a[r],map.getOrDefault(a[r],0)+1);
            while(map.size()>k){
                map.put(a[l],map.get(a[l])-1);
                if(map.get(a[l])==0)map.remove(a[l]);
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
}