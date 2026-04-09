import java.util.*;
class Student{
    String name;
    int id;
    int mark;
    Student(int id,String n,int m){
        this.name=n;
        this.id=id;
        this.mark=m;
    }
    @Override
    public String toString(){
        return name+"-"+mark;
    }
}
public class ComparatorExample {
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        students.add(new Student(101,"J",70));//Object Creation + Adding to List in one line
        students.add(new Student(190,"A",85));
        students.add(new Student(103,"S",75));
        students.add(new Student(1,"U",67));
        Comparator<Student> byname=new Comparator<Student>(){
            public int compare(Student a,Student b){
                return Integer.compare(a.id,b.id);
            }
        };
        Collections.sort(students,(a,b)->a.id-b.id);
        System.out.print(students);




    }
}
