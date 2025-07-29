bool search(int* a, int n, int t) {
    for(int i=0;i<n;i++){
        if(a[i]==t)
        return true;
    }
    return false;
}