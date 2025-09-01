class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] a=allowed.toCharArray();
        int c=0;
        boolean p=false,con=false;
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            con=true;
            for(int j=0;j<ch.length;j++){
             p=false;
                for(int k=0;k<a.length;k++){
                if(a[k]==ch[j]){
                p=true;
                break;
                }
                }
                if(!p){
                con=false;
                break;
            }
            }
            
            if(con)c++;
        }
        return c;
    }
}