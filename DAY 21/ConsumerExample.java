import java.util.function.Consumer;
import java.util.*;
class Student{
    String name;
    Student(String n){
        this.name=n;
    }
}
public class ConsumerExample {
    public static void main(String[] args){
        Consumer<String> printString=(s)->System.out.println(s);
        Consumer<Student> printObject=(obj)->System.out.println(obj.name);
        //printString.accept("Hello Kitty");
        List<String> names=List.of("Hi","Hello","hello world");
        names.forEach(name->System.out.println(name));
        names.forEach(System.out::println);
        //printObject.accept(new Student("From class"));
    }
}
