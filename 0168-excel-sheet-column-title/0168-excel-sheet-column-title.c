char* convertToTitle(int n) {
    char r[100];
    static char s[100];
int i=0,k=0;
    while(n>0){
        n--;
        r[i++]='A'+(n%26);
        n/=26;
    }
    for(int j=i-1;j>=0;j--){
s[k++]=r[j];
    }
    s[k] = '\0';
    return s;
}