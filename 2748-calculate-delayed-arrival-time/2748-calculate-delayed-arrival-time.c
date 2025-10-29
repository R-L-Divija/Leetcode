int findDelayedArrivalTime(int a, int d) {
 int c=a+d;
 if(c>=24)return c-24;
 return c;
    
}