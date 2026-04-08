import java.util.*;
public class SetExample {
    public static void main(String[] args){
        Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> set1=new HashSet<>();
        int[] arr={5,3,9,1,7,2};
        for(int i:arr){
            set.add(i);
            set1.add(i);
        }
        System.out.println(set);
        System.out.println(set1);
    }
}
