import java.util.*;
public class Traversal {
    public static void main(String[] args){
        List<Integer> lst=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        //Iterator
        //Iterator<Integer> it=lst.iterator();
        //while(it.hasNext()){
          //  int cur=it.next();
            //if(cur==4){
              //  it.remove();
            //}
        //}
        //System.out.println(lst);
        //ListIterator 
        ListIterator<Integer> lt=lst.listIterator(lst.size());
        while(lt.hasPrevious()){
            int prev=lt.previous();
            System.out.print(prev+" ");
        }

    }
}
