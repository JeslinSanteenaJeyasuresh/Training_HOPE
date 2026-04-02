public class Wrapper{
    public static void main(String[] args){
        Integer b=Integer.valueOf("123456");//returns Object datatype
        Integer c=Integer.parseInt("234567");//returns int datatype
        int a=b.intValue();//unboxing
        Integer x=128;
        x=130;
        System.out.println(x);
        Integer y=128;
        //System.out.println(x==y);
        //System.out.println(x.equals(y));
    }
}