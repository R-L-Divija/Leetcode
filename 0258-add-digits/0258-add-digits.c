
int loop(int n){
    int rem=0,sum=0;
    while(n>0){
        rem=n%10;
        sum+=rem;
        n/=10;
    }
    return sum;
}
int addDigits(int num) {
if(num>=0 && num<=9)return num;
int s=0;
while(num>9){
s=loop(num);
num=s;
}
return num;

}