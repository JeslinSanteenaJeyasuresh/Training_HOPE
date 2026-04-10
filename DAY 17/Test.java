import java.util.*;
public class Test{
    public  static void frequency(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> lst=new ArrayList<>(map.keySet());
        Comparator<Character> cmp=new Comparator<Character>(){
            public int compare(Character a,Character b){
                if(map.get(a).equals(map.get(b))){
                    return a-b;
                }
                else{
                    return map.get(b)-map.get(a);
                }
            }
        };
        Collections.sort(lst,cmp);
        System.out.print(lst);
    }
    public static void main(String[] args){
        String str="jess";
        frequency(str);
    }
}