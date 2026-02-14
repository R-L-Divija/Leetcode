class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long>res=new ArrayList<>();
        Stack<Long>st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            // if(st.isEmpty()){
            //     st.push(nums[i]);
            // }else{
            //     int t=st.peek();
            //     if(t==nums[i]){
            //         int sum=st.pop();
            //         sum+=nums[i];
            //         st.push(sum);
            //     }
            //     else{
                long e=nums[i];
                while(!st.isEmpty() && st.peek()==e){
                    e+=st.pop();
                }
                    st.push(e);
                
        }
        while(!st.isEmpty()){
            res.add((long)st.pop());
        }
        Collections.reverse(res);
return res;

    }
}