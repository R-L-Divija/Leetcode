void rotate(int* a, int n, int k) {
    int *temp=(int *)malloc(n*sizeof(int));
    k=k%n;
for(int i=0;i<k;i++){
temp[i]=a[n-k+i];
}
for(int i=k;i<n;i++){
    temp[i]=a[i-k];
}
for(int i=0;i<n;i++){
   a[i]= temp[i];
}
free(temp);
}