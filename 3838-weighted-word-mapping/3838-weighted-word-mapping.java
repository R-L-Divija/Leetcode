class Solution {
   public int func(String s,int weights[]){
    int sum=0;
    for(char x:s.toCharArray()){
        sum+=weights[x-'a'];
    }
    return (int)(sum%26);
   }
    public String mapWordWeights(String[] words, int[] weights) {
       String arr[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       StringBuilder temp=new StringBuilder();
       for(int i=0;i<words.length;i++){
       int t=func(words[i],weights);
       temp.append(arr[25-t]);
       }
       return temp.toString();
    }
}