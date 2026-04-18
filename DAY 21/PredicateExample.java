import java.util.function.Predicate;
class Student{
    int mark;
    Student(int m){
        this.mark=m;
    }
}
public class PredicateExample {
    public static void main(String[] args){
        Predicate<Integer> iseven=(n)->n%2==0;
        Predicate<Integer> isodd=iseven.negate();
        Predicate<Student> ispass=(s)->s.mark>40;
        System.out.println(iseven.test(10));
        System.out.println(ispass.test(new Student(45)));
    }
}
