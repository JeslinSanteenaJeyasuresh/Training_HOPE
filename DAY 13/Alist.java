import java.util.*;
public class Alist{
    public static void main(String[] args){
        ArrayList<Integer> lst=new ArrayList<>(Arrays.asList(1,2,2,3,4,4,4,5,6,6));
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)%2==0){
                lst.remove(i);
                i--;
            }
        }
        System.out.println(lst);

    }
}