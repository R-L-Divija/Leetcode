class Solution {
    public String intToRoman(int num) {
       StringBuilder s1=new StringBuilder();
       int v[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String s[]={
    "M","CM","D","CD",
    "C","XC","L","XL",
    "X","IX","V","IV","I"
};

       for(int i=0;i<v.length;i++){
        if(num==0)break;
        while(num>=v[i]){
            s1.append(s[i]);
            num-=v[i];
        }
       }

return s1.toString();
    }
}