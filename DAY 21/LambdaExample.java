public class LambdaExample{
    public static void main(String[] args){
        Math obj=(a,b)->a+b;

        Excercise ex=()->System.out.println("Hello World");
        ex.sayhello();
        // Math obj=new Math(){
        //     @Override
        //     public int add(int a ,int b){
        //         return a+b;
        //     }
        // };
        System.out.println(obj.add(12,11));
    }

    
}
@FunctionalInterface
interface Math{
    int add(int a ,int b);
}
@FunctionalInterface
interface Excercise{
    void sayhello();
}
