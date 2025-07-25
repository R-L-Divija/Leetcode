class Solution {
    public boolean isPalindrome(String s) {

        int st=0;
        int e=s.length()-1;
        while(st<e){
            if(Character.isLetter(s.charAt(st))&&Character.isLetter(s.charAt(e))){
                if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(e))) return false;
                    st++;
                    e--;
                
            }
            else if(Character.isDigit(s.charAt(st))&&Character.isDigit(s.charAt(e))){
                if(s.charAt(st)!=s.charAt(e)) return false;
                    st++;
                    e--;
                
            }
            else if(!Character.isLetter(s.charAt(st))&& !Character.isDigit(s.charAt(st))){
                st++;
            }
                        else if(!Character.isLetter(s.charAt(e))&& !Character.isDigit(s.charAt(e))){
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}