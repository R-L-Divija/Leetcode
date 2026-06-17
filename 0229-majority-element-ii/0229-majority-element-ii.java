class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>p=new ArrayList<>();
        int c1=0,e1=0;
        int c2=0,e2=0;
        for(int x:nums){
            if(x==e1)c1++;
            else if(x==e2)c2++;
            else if(c1==0){
                e1=x;
                c1=1;
            }
            else if(c2==0){
                e2=x;
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        c1=c2=0;
        for(int x:nums){
            if(x==e1)c1++;
            else if(x==e2)c2++;
        }
        if(c1>nums.length/3)p.add(e1);
        if(c2>nums.length/3)p.add(e2);
        return p;
    }
}