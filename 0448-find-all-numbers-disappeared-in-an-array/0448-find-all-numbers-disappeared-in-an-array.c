/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* a, int n, int* r) {
  for(int i=0;i<n;i++){
int index=abs(a[i])-1;
if(a[index]>0){
    a[index]=-a[index];
}
  }
  int c=0;
  int *r1=(int *)malloc(sizeof(int)*n);
  for(int i=0;i<n;i++){
    if(a[i]>0){
        r1[c++]=i+1;
    }
  }
  *r =c;
  return r1;
}