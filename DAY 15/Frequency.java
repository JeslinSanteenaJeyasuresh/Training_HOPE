import java.util.*;
public class Frequency {
    public static void main(String[] args){
        char[] lst={'S','A','J','S','J','J'};
        Map<Character,Integer> map=new HashMap<>();
        //for(char ch:lst){
            //map.put(ch,map.getOrDefault(ch,0)+1);
        //}
        for(char i:lst){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue()+"times");
        }
    }
}
