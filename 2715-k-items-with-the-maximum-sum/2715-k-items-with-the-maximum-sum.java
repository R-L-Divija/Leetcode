class Solution {
    public int kItemsWithMaximumSum(int nO, int nZ, int nN, int k) {
        int[] res=new int[nO+nZ+nN];
        int sum=0;
for(int i=0;i<nO;i++){
    res[i]=1;
}for(int i=nO;i<nZ+nO;i++){
    res[i]=0;
}for(int i=nZ+nO;i<nN+nZ+nO;i++){
    res[i]=-1;
}
for(int i=0;i<k;i++){
    sum+=res[i];
}
return sum;
    }
}