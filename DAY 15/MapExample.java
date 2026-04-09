import java.util.*;
public class MapExample {
    public static void main(String[] args){
        int[] arr={1,2,3,3,4,5};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
            //map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("----------------------------------------------");
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        
    }
}
