int firstUniqChar(char* s) {

    for(int i=0;i<strlen(s);i++){
        bool u=true;
        for(int j=0;j<strlen(s);j++){
        if(i!=j&&s[i]==s[j]){
            u=false;
            break;
        }
        }
        if(u)return i;
    }
    return -1;
}