class Solution {
    public int numWaterBottles(int n1, int n2) {
   int sum=n1;
   while(n1>=n2){
sum+=n1/n2;
n1=(n1/n2)+(n1%n2);
   }
   return sum;
    }
}