void reverseString(char* s, int n) {
    int j=0;
    char *s1=(char*)malloc((n+1)*sizeof(char));
    for(int i=n-1;i>=0;i--){
        s1[j++]=s[i];
    }
   s1[j]='\0';
   for(int i=0;i<n;i++){
    s[i]=s1[i];
   }
}