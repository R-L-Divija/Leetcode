class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,ArrayList<String>>map=new HashMap<>();
       for(String x:strs){
       char[] ch=x.toCharArray();
       Arrays.sort(ch);
       String k=new String(ch);
       map.putIfAbsent(k,new ArrayList<>());
       map.get(k).add(x);
       } 
       return new ArrayList<>(map.values());
    }
}