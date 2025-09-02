int removeDuplicates(int* a, int n) {
    if (n==0) return 0;
    int j=1;
    for(int i=1;i<n;i++){
        if(a[i]!=a[i-1]){
        a[j++]=a[i];
        }
    }
    return j;
}