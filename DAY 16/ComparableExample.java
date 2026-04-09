import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;
    int mark;

    Student(String n,int m){
        this.name=n;
        this.mark=m;
    }
    @Override
    public int compareTo(Student s){
        return this.mark-s.mark;//Logic: if the subtraction result is positive it pushes the already exsiting element in the list to the right of the new element else remains same
        //here only sorting takes place
    }
    @Override
    public String toString(){
        return name+"-"+mark;
    }
}
public class ComparableExample{
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        students.add(new Student("A",70));//Object Creation + Adding to List in one line
        students.add(new Student("B",85));
        students.add(new Student("C",75));
        students.add(new Student("D",67));
        Collections.sort(students);//when this line is executed comapareTo() method is called and sorts it
                                   //and then toString() method is also called 
        System.out.println(students);
    }
}