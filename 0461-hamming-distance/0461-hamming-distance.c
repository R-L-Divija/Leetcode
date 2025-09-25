int hammingDistance(int x, int y) {
    int num=x^y;
    int c=0;
    while(num){
        c++;
        num=num&(num-1);
    }
    return c;
}