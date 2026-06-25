class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(a.contains(b))return 1;
        int c=1;
        int l=a.length()+b.length();
        StringBuilder sb=new StringBuilder();
        while(sb.length()<l){
            sb.append(a);
            if(sb.toString().contains(b))return c;
            c++;
        }
        return -1;
    }
}