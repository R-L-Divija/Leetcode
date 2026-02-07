class Solution {
    public int countPairs(List<Integer> arr, int target) {
Collections.sort(arr);
int l=0;
int r=arr.size()-1;
int s=0;
int c=0;
while(l<r){
s=arr.get(l)+arr.get(r);
if(s<target){
    c+=r-l;
    l++;
}else{
r--;
}
}
return c;
    }
}