import java.util.*;
public class Task {
    public static int closest(int[] array,int target){
        TreeSet<Integer> arr=new TreeSet<>();
        for(int i:array){
            arr.add(i);
        }
        int n=array.length;
        Integer h=arr.higher(target);//we use Wrapper class since higher() can return null which int datatype cant store
        Integer l=arr.lower(target);//we use Wrapper class since higher() can return null which int datatype cant store
        if(h==null)return l;
        if(l==null)return h;
        int diff1=target-l;//we use lower() and higher() and not ceiling(),floor() since it ceiling ,floor are inclusive 
        int diff2=h-target;//but lower()& higher() are strictly lower and higher
        if(diff1<=diff2){
            return l;
        }
        else{
            return h;
        }
    }
    public static void main(String[] args){
        int[] nums={10,15,20,27,40};
        int target=15;
        int close=closest(nums,target);
        System.out.print("The Closest Element to "+target+" is "+close);
    }
}
