class Solution {
    public int firstUniqChar(String s) {
       char[] c=s.toCharArray();

       for(int i=0;i<c.length;i++){
        boolean uni=true;
        
        for(int j=0;j<c.length;j++){
            if(i!=j&&c[i]==c[j]){
            uni=false;
            break;
            }
        }
        if(uni){
            return i;
            
        }
    
       }
       return -1;

    }
}