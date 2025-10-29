int kItemsWithMaximumSum(int no, int nz, int nn, int k) {
    if(no==0 && nz==0 && nn==0)return 0;
    int n=no+nz+nn;
    int a[n];
    int s=0;
    for(int i=0;i<no;i++){
        a[i]=1;
    }
    for(int i=no;i<no+nz;i++){
        a[i]=0;
    }
    for(int i=no+nz;i<no+nz+nn;i++){
        a[i]=-1;
    }
    for(int i=0;i<k;i++){
s+=a[i];
    }
    return s;
}