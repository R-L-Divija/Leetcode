int rev(int n1){
    int rem=0,r=0;
    
    while(n1>0){
        rem=n1%10;
        r=r*10+rem;
        n1/=10;
    }

    return r;
}

bool isSameAfterReversals(int num) {
    if(num>=0 && num<=9)return true;
    int org=num;
    int s=rev(num);
   int s1=rev(s);
   if(s1==org)return true;
    return false;
    
}