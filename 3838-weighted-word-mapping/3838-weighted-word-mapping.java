class Solution {
    public int calc(String temp,int[]weights){
        int sum=0;
        for(char x:temp.toCharArray()){
            sum+=weights[x-'a'];
        }
        return sum%26;
    }
    public String mapWordWeights(String[] words, int[] weights) {
        String arr[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        int l=0;
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int t=calc(words[i],weights);
         
            temp.append(arr[25-t]);
        }
        return temp.toString();
    }
}