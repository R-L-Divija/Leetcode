class Solution {
    
    public int maxNumberOfBalloons(String text) {
       String s="balloon";
    HashMap<Character,Integer>map=new HashMap<>();
    for(char x:text.toCharArray()){
        if(s.indexOf(x)!=-1){
            if(map.containsKey(x)){
           map.put(x, map.getOrDefault(x,0)+1);}
           else map.put(x,1);
        }
    }
       if(!map.containsKey('b') || !map.containsKey('a')||!map.containsKey('l') ||!map.containsKey('o')||!map.containsKey('n')   )return 0;
       int x1=map.get('b');
       int x2=map.get('a');
       int x3=map.get('l')/2;
       int x4=map.get('o')/2;
       int x5=map.get('n');
       
    
    //    if(x1>=1 && x2>=1 && x3>=1 && x4>=1 && x5>=1){
        return Math.min(x1,Math.min(x2,Math.min(x3,Math.min(x4,x5))));
    //    }
    //    return 0; 

    }
}