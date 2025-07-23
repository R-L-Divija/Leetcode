int rob(int* a, int n) {
  if(n==0)return 0;
  if(n==1)return a[0];
  int p1=0,p2=0;
   for(int i=0;i<n;i++){
int t=p1;
p1=fmax(p2+a[i],p1);
p2=t;
   } 
   return p1;
   
}