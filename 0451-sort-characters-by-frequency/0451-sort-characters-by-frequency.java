class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        int f[]=new int[128];
        for(char c:s.toCharArray()){
            f[c]++;
        }
        while(sb.length()<s.length()){
            int max=0;
            for(int i=0;i<128;i++){
                if(f[i]>f[max]){
                    max=i;
                }
            }
            for(int i=0;i<f[max];i++){
                sb.append((char)max);
            }
            f[max]=0;
        }
        return sb.toString();
    }
}