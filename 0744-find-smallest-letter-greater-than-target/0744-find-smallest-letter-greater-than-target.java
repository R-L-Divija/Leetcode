class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for(char x: letters){
            if(target<x)return x;
        }
        return letters[0];
    }
}